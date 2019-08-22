package practice04;

public class Student extends  Person{
    private int kClass;

    public int getkClass() {
        return kClass;
    }

    public void setkClass(int kClass) {
        this.kClass = kClass;
    }

    public Student(String name, int age, int kClass) {
        super(name, age);
        this.kClass = kClass;
    }

    @Override
    public String introduce() {
        return this.basicIntroduce()+" I am a Student. I am at Class "+this.kClass+".";
    }
}
