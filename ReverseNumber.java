public class ReverseNumber{
    public static void main(String[] args) {
        int number = 4523;
        int rev = 0;

        // StringBuilder sb = new StringBuilder(String.valueOf(number));
        // rev = Integer.valueOf(sb.reverse().toString());
        // System.out.println("reverse number "+rev);

        while(number != 0){
            int rem = number % 10;
            rev = rev*10 + rem;
            number /= 10;
        }
        System.out.println(" reverse number "+rev);
    }
}