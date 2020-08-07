public class UniqueChar {
    public static void main(String[] args) {
        String str = "initialize";

        String[] arr = str.split("");
        String unique="";

        for(int j=0; j<arr.length; j++) {
            int num=0;
            for(int i=0; i<arr.length; i++ ) {
                if(arr[i].equals(arr[j]) ) {
                    num++;
                }
            }
            if(num==1) {
                unique += arr[j];
            }
        }
        System.out.println(unique);
    }
}
