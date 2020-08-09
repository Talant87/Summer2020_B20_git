public class DivisibleBy {
    public static void main(String[] args) {
        String divisibleBy15 ="";
        String divisibleBy5 ="";
        String divisibleBy3="";

        int[] arr = new int[100];

        for(int i=0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for(int each: arr) {
            if(each %15==0 && each %3==0) {
                divisibleBy15 += each + " ";
            }
            if(each %5==0 && each % 15!=0) {
                divisibleBy5 += each + " ";
            }
            if(each%3==0 && each %15!=0) {
                divisibleBy3 += each + " ";
            }
        }
        System.out.println("Divisible By 15: "+divisibleBy15);
        System.out.println("Divisible By 5: "+divisibleBy5);
        System.out.println("Divisible By 3: "+divisibleBy3);
    }
}
