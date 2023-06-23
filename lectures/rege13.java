import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rege13 {
    public static void main(String[] args) {
        //String
        String arr[] = {"aaa","abcd","manana"};
        for(String res :arr){
            if(res.matches("[a-z]{4}")==true)
            {
                System.out.println(res);
            }
        }
//        System.out.println(str.matches("[a-z]{5}"));
    }
}
