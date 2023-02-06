// swap two string without using temp variable 
public class SwapTwoStringWithoutUsingTemp{
    public static void main(String[] args) {
        String str1 = "tech";
        String str2 = "cloud";
        System.out.println("Before Swap String str1 is : " +str1);
        System.out.println("Before Swap String str2 is: "+str2);

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length()-str2.length());
        str1 = str1.substring( str2.length());

        System.out.println("after Swap String str1 : " +str1);
        System.out.println("After Swap String str2 : "+str2);
    }
}