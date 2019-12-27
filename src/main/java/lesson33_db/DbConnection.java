package lesson33_db;

import java.sql.*;
import java.util.ArrayList;

public class DbConnection {

    private Connection conn;

    public void connect() throws SQLException {
        conn = DriverManager.getConnection("jdbc:sqlite:c:/lesson/lesson24_sql/lesson24_sql.db");

    }

    public ArrayList<Student> getAllStudent() throws SQLException {
        ArrayList<Student> students = new ArrayList<>();

        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            double grade = resultSet.getDouble("grade");
            int course = resultSet.getInt("course");

//            Student student = new Student(id, name, grade, course);
//            student.setId(id);
//            student.setName(name);
//            student.setGrade(grade);
//            student.setCourse(course);
//            students.add(student);

            students.add( new Student(id, name, grade, course));
        }
        return  students;
    }

    public int insertStudent(Student student) throws SQLException {
        PreparedStatement statement = conn.prepareStatement("INSERT INTO student(name, grade, course)" +
                "VALUES(?, ?, ?)");
        statement.setString(1, student.getName());
        statement.setDouble(2, student.getGrade());
        statement.setInt(3, student.getCourse());

        statement.executeUpdate();

        ResultSet generatedKeys = statement.getGeneratedKeys();
        generatedKeys.next();
        int studentId =  generatedKeys.getInt(1);

        statement.close();

        return studentId;
    }
}
