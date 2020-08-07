import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String reverse="";

        for(int i=str.length()-1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }
        System.out.println(reverse);
    }
}
