import java.util.*;
class string{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start=0;
        int end = str.length()-1;
        Boolean res = true;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                res = false;
            }
            start++;
            end--;
        }

        if(res){
            System.out.println("String is Palindorme");
        }
        else{
            System.out.println("String is not palindorme");
        }

        sc.close();
    }
}