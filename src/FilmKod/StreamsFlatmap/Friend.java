package FilmKod.StreamsFlatmap;

import java.util.List;

public class Friend {

    private String name;
    private String address;
    private List<String> phone;
    private boolean nice;
    private int age;

    public Friend(String name, String address, List<String> phone, boolean nice, int age) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.nice = nice;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }


    public boolean isNice() {
        return nice;
    }

    public void setNice(boolean nice) {
        this.nice = nice;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
