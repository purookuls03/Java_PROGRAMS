import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rege89 {
    public static void main(String[] args) {
        String target = "jdbc regular98745 expression46645 jdbc is 544563663239important";
        Pattern p = Pattern.compile("[0-9]{4}");
        Matcher m = p.matcher(target);
        int ctr = 0;
        while(m.find())
        {
            ctr++;
            System.out.println(m.start()+"--"+m.end()+"--"+m.group());
        }
        System.out.println(ctr);
    }
}
