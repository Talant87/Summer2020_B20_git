public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] n ={1,-2,3,4,-5,6,7,-8,9,0};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int each: n) {
            if (each > max) {
                max = each;
            }
        }
        for(int each: n) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println("Max is: "+max);
        System.out.println("Min is: "+min);
    }
}
