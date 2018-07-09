package work4;

import java.util.ArrayList;
import java.util.List;

//文件夹
public class Folder implements IFile {

    private String name;
    private List<IFile> files;

    public Folder(String name) {
        super();
        this.name = name;
        files = new ArrayList<IFile>();
    }

    public String getName() {
        return name;
    }

    //与File的删除方法不同，先删除下面的文件以及文件夹后再删除自己
    public void delete() {
        List<IFile> copy = new ArrayList<IFile>(files);
        System.out.println("------------删除子文件-------------");
        for (IFile file : copy) {
            file.delete();
        }
        System.out.println("----------删除子文件结束-------------");
        System.out.println("---删除[" + name + "]---");
    }

    public void createNewFile(String name) {
        if (name.contains(".")) {
            files.add(new File(name));
        } else {
            files.add(new Folder(name));
        }
    }
}