package work3;

import java.util.List;

public class Resume {
    private String name;
    private int age;
    private String intro;
    private List<String> phones;

    public Resume(String name, int age, String intro, List<String> phones) {
        this.name = name;
        this.age = age;
        this.intro = intro;
        this.phones = phones;
    }

    public Resume clone(){
        Resume resume = null;
        try {
            resume = (Resume) super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return resume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
