import java.util.Scanner;

//// find the sum of digits of the given numbers....
public class FindSumOfDigitInNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int nums = sc.nextInt();
        int sum = 0;

        while(nums > 0){
            int remender = nums % 10;
            sum += remender;
            nums = nums/10;

        }
        System.out.println(" Sum of digit => " +sum);

    }
}