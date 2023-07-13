public class number {
    public static void main(String[] args) {
        int n = 32145;
        int temp = n;
        int inv=0;
        while(temp!=0){
            int rem = temp%10;
            inv = inv*10+rem;
            temp/=10;
        }
        System.out.println(inv);
    }
}
// Inverse of 32145 is 12543