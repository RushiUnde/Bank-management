import java.sql.*;

class MysqlCon {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/roll", "root", "Jangral@123");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from roll1");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) );
            con.close();
        } catch (Exception e) {
            System.out.println(e);
 }
}
}