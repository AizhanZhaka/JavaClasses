package lesson33_db;

import java.sql.SQLException;
import java.util.ArrayList;

public class EntityExample {
    public static void main(String[] args) throws SQLException {
        DbConnection manager = new DbConnection();
        manager.connect();

        ArrayList<Student> allStudent = manager.getAllStudent();
        for(Student s: allStudent){
            System.out.println(s);
        }

        Student s = new Student();
        s.setName("Arai");
        s.setCourse(1);
        s.setGrade(3.5);

        int studentId = manager.insertStudent(s);
        System.out.println("New student id = " + studentId);
    }

}
