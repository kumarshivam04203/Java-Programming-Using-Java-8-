// how to get Even and Odd numbers from the list using java 8 features..
import java.util.*;
import java.util.stream.Collectors;
public class FindEvenOddNumbersUsingJava8{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,4,3,6,5,7,1,9);

        // List<Integer> evenNumbers = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        // List<Integer> oddNumbers = nums.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());

        // System.out.println("Even numbers" +evenNumbers);
        // System.out.println(" Odd Numbers" +oddNumbers);


        
        Map<Boolean, List<Integer>> resultMap = nums.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> evenNumbers = resultMap.get(true);
        List<Integer> oddNumbers = resultMap.get(false);

        System.out.println("Even Number" +evenNumbers);
        System.out.println("Odd nUmbers " +oddNumbers);
    }
}