public class DivideWithoutOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;

        if(num2==0) {
            System.out.println("Invalid Number");
            return;
        }

        System.out.print(num1 +" divide by "+num2 +" is: ");

        int count =0;
        while(num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count+" and remainder is "+num1);
    }
}
