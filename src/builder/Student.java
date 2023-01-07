package builder;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

    private int rollNo;
    private String name;
    private String batch;
    private Date dob;
    private String gender;
    private Date startDate;
    private int gradYear;
    private String phoneNumber;
    private double cgpa;
    private long id;

    private Student(StudentBuilder studentBuilder){
        this.rollNo = studentBuilder.rollNo;
        this.name = studentBuilder.name;
        this.batch  = studentBuilder.batch;
        this.dob = studentBuilder.dob;
        this.gender = studentBuilder.gender;
        this.startDate = studentBuilder.startDate;
        this.gradYear = studentBuilder.gradYear;
        this.phoneNumber = studentBuilder.phoneNumber;
        this.cgpa = studentBuilder.cgpa;
        this.id = studentBuilder.id;
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    @Override
    public String toString() {
        return this.name + " " + this.cgpa + " " + this.batch + " " + this.gender + " " + this.dob;
    }

    public static class StudentBuilder{
        private int rollNo;
        private String name;
        private String batch;
        private Date dob;
        private String gender;
        private Date startDate;
        private int gradYear;
        private String phoneNumber;
        private double cgpa;
        private long id;

        public StudentBuilder setRollNo(int rollNo){
            this.rollNo = rollNo;
            return this;
        }

        public StudentBuilder setName(String name){
            this.name = name;
            return this;
        }

        public StudentBuilder setBatch(String batch){
            this.batch = batch;
            return this;
        }

        public StudentBuilder setDOB(String dob) throws ParseException {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
            this.dob = dateFormat.parse(dob);
            return this;
        }

        public StudentBuilder setGender(String gender){
            this.gender = gender;
            return this;
        }

        public StudentBuilder setStartDate(Date startDate){
            this.startDate = startDate;
            return this;
        }

        public StudentBuilder setGradYear(int gradYear){
            this.gradYear = gradYear;
            return this;
        }

        public StudentBuilder setPhoneNo(String phoneNo){
            this.phoneNumber = phoneNo;
            return this;
        }

        public StudentBuilder setCGPA(double cgpa){
            this.cgpa = cgpa;
            return this;
        }

        public StudentBuilder setid(long id){
            this.id = id;
            return this;
        }

        public Student build(){
            return new Student(this);
        }


    }

}
