package StreamDemo;


import java.util.List;

public class Person {
    
    protected String name;
    protected int age;
    protected String nationality;
    protected List<String> phone;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public Person(String name, int age, String nationality){
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public Person(String name, int age, String nationality, List<String> phones){
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.phone = phones;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", phone=" + phone +
                '}';
    }

    public int getAge(){
        return age;
    }
    
    public String getName(){
        return name;
    }
    
    public String getNationality(){
        return nationality;
    }
}
