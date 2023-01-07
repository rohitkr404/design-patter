package builder;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class client {
    public static void main(String[] args) throws ParseException {
        Student student = Student.getBuilder().setid(10l)
                .setBatch("2019")
                .setCGPA(7.13)
                .setDOB("29/03/1997")
                .setName("Rohit Kumar")
                .setGender("Male").build();

        System.out.println(student.toString());
    }
}
