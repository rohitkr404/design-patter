package prototype;

public class Client {

    public static void main(String[] args) {
        Student brilliantStudent = new IntelligentStudent();

        brilliantStudent.setAge(25);
        brilliantStudent.setBatch("2019");
        brilliantStudent.setCgpa(7.3);
        brilliantStudent.setName("Rohit");

        Registry.register("Intelligent Student",brilliantStudent);


        Student brilliantStudentCopy = Registry.get("Intelligent Student");
        brilliantStudentCopy.setName("ABC");
    }
}
