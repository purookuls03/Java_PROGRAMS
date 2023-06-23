import java.util.regex.Matcher;
import java.util.regex.Pattern;

class rege90 {
    public static void main(String[] args) {
        String target = "2Bf5BBg7BBBi%BHS&$";
        Pattern p = Pattern.compile("[B]?");
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
