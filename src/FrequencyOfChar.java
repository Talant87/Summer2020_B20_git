import java.util.Scanner;
public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String nonDup = "";

        for(int i=0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))){
                nonDup += "" + str.charAt(i);
            }
        }
        String expectedResult = "";

        for( int j=0;j < nonDup.length(); j++){
            int count = 0;
            for(int i=0; i < str.length(); i++) {
                if(str.charAt(i) == nonDup.charAt(j)) {
                    count++;
                }
            }
            expectedResult +=nonDup.charAt(j)+"" + count;
        }
        System.out.println(expectedResult);
    }
}
