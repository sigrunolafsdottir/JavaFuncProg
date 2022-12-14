package ÖvnUppg6_HögreOrdningensFunktioner;


public class Kompis {

    protected String name;
    protected String address;
    protected String phone;
    protected int age;

    public Kompis(String name, String address, String phone, int age){
        this.name = name;
        this.address = address;
        this.age=age;
        this.phone = phone;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
