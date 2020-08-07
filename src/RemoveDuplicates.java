public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Cincinnati";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))){
                result += "" + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
