package ObjectCloningExample;

public class Client {

    public static void main(String[] args) {
        Student brilliantStudent = new IntelligentStudent();

        brilliantStudent.setAge(25);
        brilliantStudent.setBatch("2019");
        brilliantStudent.setCgpa(7.3);
        brilliantStudent.setName("Rohit");

        Student brilliantStudentCopy = brilliantStudent.clone();
        brilliantStudentCopy.setName("Ankit");
    }
}
