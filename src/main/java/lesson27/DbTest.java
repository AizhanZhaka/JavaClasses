package lesson27;

import java.sql.*;

public class DbTest {
    public static void main(String[] args) throws SQLException {
        //getConnection(url: "jbdc:sqlite:c:lesson/lesson24_sql.db");

        Connection conn = DriverManager.getConnection("jdbc:sqlite:c:/lesson/lesson24_sql.db");

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("Select * FROM student");

        ResultSetMetaData metaData = rs.getMetaData();
        System.out.println(metaData.getColumnCount());

        int columnCount = metaData.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            String columName = metaData.getColumnName(i);
            System.out.print(columName + "\t");
        }
        System.out.println();

        while (rs.next()){
            //code
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double grade = rs.getDouble("grade");
            int course = rs.getInt("course");
            System.out.println(id + "\t" + name + "\t" + grade + "\t" +course);

        }

//       int res =  stmt.executeUpdate("INSERT into student VALUES(6, 'Brin', 1.5, 4)");
//        System.out.println(res);

//       int  res =  stmt.executeUpdate("UPDATE student SET course = 3 where course = 2");
//        System.out.println(res);

//        int  res =  stmt.executeUpdate("DELETE FROM student WHERE course = 4");
//        System.out.println(res);


//        dlya dz
//        metaData.getColumnType();
//        metaData.getColumnTypeName();


        conn.close();

    }
}

