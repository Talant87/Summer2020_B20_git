import java.util.Arrays;

public class StringSame {
    public static void main(String[] args) {
        String a = "abc";
        String b = "baca";
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String a1="", a2="";
        for(char each: ch1){
            a1 += each;
        }
        for(char each: ch2) {
            a2 += each;
        }
        System.out.println(a1.equals(a2)) ;
    }
}
