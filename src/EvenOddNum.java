public class EvenOddNum {
    public static void main(String[] args) {
        int n = 13;
        if(n%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        System.out.println("=====");
        String result = n%2==0 ? "even" : "odd" ;
        System.out.println(result);
    }
}
