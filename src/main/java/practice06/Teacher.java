package practice06;

public class Teacher extends Person{
    private int Klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        Klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return Klass;
    }

    public void setKlass(int klass) {
        Klass = klass;
    }

    @Override
    public String introduce() {
        String introduceMessage="";
        if(this.Klass != 0){
             introduceMessage=super.introduce()+"I am a Teacher. I teach Class "+this.Klass+".";
        }else {
            introduceMessage= super.introduce()+" I am a Teacher. I teach No Class.";
        }
        return introduceMessage;
    }
}
