
public class pattern_04 {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'k'; i++) {
            for (char j = 'a'; j <= i; j++) {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
