package prototype;

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private String batch;
    private double cgpa;

    public Student(){

    }

    public Student(Student s){
        this.name = s.name;
        this.age = s.age;
        this.batch = s.batch;
        this.cgpa = s.cgpa;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setBatch(String batch){
        this.batch = batch;
    }

    public void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }

    public Student clone(){
        return new Student(this);
    }
}
