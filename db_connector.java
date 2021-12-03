import com.mysql.cj.jdbc.Driver;

import java.sql.*;

class db_connector {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //predifined class c is capital specify the name of driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //connection is an interface closeable
        //road banaya url path hai jiske through jaenge database pe
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/i_2021","root","");
        //vehicle ka kaam kr rha hai, ek querry send kari
        Statement s = con.createStatement();
        //output le liya phir
        ResultSet rs = s.executeQuery("select * from student_details");
        while (rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        }
    }
}