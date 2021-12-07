import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_01 {
    public static void main(String[] args){
        Pattern p = Pattern.compile("JDBC");
        Matcher m = p.matcher("ABCDJDBCEFHSBJDBCJDBCCBHDJDBGHJDBC");
//        int ctr = 0;
        while (m.find())
        {
            System.out.println(m.start());
            System.out.println(m.end());
            System.out.println(m.group());
//            ctr++;
        }
//        System.out.println(ctr);
    }
}
