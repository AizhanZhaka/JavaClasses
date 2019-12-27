package lesson27;

import java.sql.*;

public class DbTest2 {
    public static void main(String[] args) throws SQLException {
        //getConnection(url: "jbdc:sqlite:c:lesson/lesson24_sql.db");

        Connection conn = DriverManager.getConnection("jdbc:sqlite:c:/lesson/lesson24_sql.db");

        PreparedStatement stmt = conn.prepareStatement("Select * FROM student where grade = ? AND name = ? ORDER BY id");

        stmt.setDouble(1,3.0);
        stmt.setString(2, "Tom");


        ResultSet rs = stmt.executeQuery();

        while (rs.next()){
            //code
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double grade = rs.getDouble("grade");
            int course = rs.getInt("course");
            System.out.println(id + "\t" + name + "\t" + grade + "\t" +course);

        }

        conn.close();

    }
}
