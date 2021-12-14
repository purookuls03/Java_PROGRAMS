iimport java.sql.*;

class JDBC_Connnector {

    public static void main(String[] args) throws SQLException {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/i_2021", "scott", "tiger");
            System.out.println("Connection Established successfully");
        } catch (Exception e) {
            System.out.println("Connection could  not be established");
        } finally {
            if (con!=null) con.close();
        }
    }

}