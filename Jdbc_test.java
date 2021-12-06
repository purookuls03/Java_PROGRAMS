/*
    insert into info values(?)
    ? = ps.setString(1,arr[0])
    ps.execute()

 */

import com.mysql.cj.jdbc.Driver;
import java.lang.*;
import java.sql.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class jdbc_test {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your emails : ");
        String str=sc.nextLine();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/puroo_i","root","");
        Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9._]+@(gmail|hotmail|yahoo|outlook|reddif|gla).(com|in)");
        Matcher m= p.matcher(str);
//       Statement s=con.createStatement();
//       ResultSet rs =s.executeQuery("select * from information");
        PreparedStatement s = con.prepareStatement("insert into info values (?)");
        boolean t = true;
        if (m.find()==false )
        {
            try {
                throw new DatanotFound("Valid E-mail is Not found");
            }
            catch (Exception i) {
                System.out.println(i);
            }
        }
        else {
            while (t) {
                s.setString(1, m.group());
                s.execute();
                t = m.find();
            }
        }
    }
}

class DatanotFound extends RuntimeException{
    DatanotFound(String j){
        super(j);
        System.out.println("Given email is not valid........");
    }
}
