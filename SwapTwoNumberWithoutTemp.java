public class SwapTwoNumberWithoutTemp{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 11;

        // num1 = num1+num2;
        // num2 = num1-num2;
        // num1= num1-num2;

        num1 = num1*num2;
        num2 = num1/num2;
        num1 = num1/num2;

        // Agar yek number ko o karne par ye condition lagege...........
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;

        System.out.println("number is num1: "+num1);
        System.out.println("number is num2: "+num2);
    }
}