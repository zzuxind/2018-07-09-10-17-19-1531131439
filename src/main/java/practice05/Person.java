package practice05;

public class Person {
    private String name;
    private int age;

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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String basicIntroduce(){
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }
    public String introduce(){
        return basicIntroduce();
    }

    public  static  void main(String[] args){
        Person person=new Person("tom",21);
        person.introduce();
    }
}
