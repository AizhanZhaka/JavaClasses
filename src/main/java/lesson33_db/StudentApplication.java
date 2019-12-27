package lesson33_db;

import java.sql.*;
import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:c:/lesson/lesson24_sql/lesson24_sql.db")) {
        System.out.println("Student's name:");
        String name = in.nextLine();

        System.out.println("Student's grade");
        double grade = in.nextDouble();

        System.out.println("Student's course");
        int course = in.nextInt();

            Statement subjectsStmt = conn.createStatement();
            ResultSet resultSet = subjectsStmt.executeQuery("SELECT * FROM subjects");

            System.out.println("Which subject will you choose:");
            while(resultSet.next()){
                String subject = resultSet.getString("name");
                int id = resultSet.getInt("id");
                System.out.println(id + ")" + subject);
            }

            int selectSubject = in.nextInt();

            //DB part
//            Statement statement = conn.createStatement();
//            statement.executeUpdate("INSERT INTO student(name, grade, course)" +
//                    "VALUES('" + name + "'," + grade + ", " + course +")");

            PreparedStatement statement = conn.prepareStatement("INSERT INTO student(name, grade, course)" +
                    "VALUES(?, ?, ?)");
            statement.setString(1, name);
            statement.setDouble(2, grade);
            statement.setInt(3, course);

            statement.executeUpdate();

            System.out.println("New student created");

            ResultSet generatedKeys = statement.getGeneratedKeys();
            generatedKeys.next();
            int studentId =  generatedKeys.getInt(1);

          PreparedStatement statement1 = conn.prepareStatement("INSERT INTO student_subject(subject_id, student_id) " +
                  "VALUES(?, ?)");
          statement1.setInt(1,selectSubject);
          statement1.setInt(2,studentId);
          statement1.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Some error occurred, please try later");
            e.printStackTrace();
        }
    }
}
