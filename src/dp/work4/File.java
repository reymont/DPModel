package work4;

//文件
public class File implements IFile {

    private String name;

    public File(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void delete() {
        System.out.println("---删除[" + name + "]---");
    }
}