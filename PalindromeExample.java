public class PalindromeExample{
    public static void main(String[] args) {
        int num = 4554;
        int rem =0, rev =0;
        int temp = num;

        while(num > 0){
            rem = num % 10;
            rev = (rev * 10)+rem;
            num = num/10;
        }
        if(temp == rev){
            System.out.println("palindrome number");
        }else{
            System.out.println("not palindrome number");
        }
    }
}