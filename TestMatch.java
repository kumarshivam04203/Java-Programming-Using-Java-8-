//Check if all the list element are divisible by 2, 
//if yes print all the numbers are divisible by 2 else 
// print all the numbers are not divisible by 2 using java 8 features.

import java.util.*;
public class TestMatch{
    //   public static void main(String[] args) {
       // List <Integer> intList = Arrays.asList(2,4,5,6,8);

       // boolean allDivisibleByTwo = intList.stream().allMatch(n -> n % 2 == 0);

        //if(allDivisibleByTwo){
            //System.out.println("all the number are divisible by two");
        //}else{
           // System.out.println("all the numbers are not divisible by two");
        //}
     //}

    // check if any list element is divisible by 2 , if yes print At least one number is divisible by 2
    //else print not a single number is divisible by 2 using java 8
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(2,4,5,6,8);

        boolean isDivisibleByTwo = intList.stream().anyMatch(n -> n % 2 == 0);

        if(isDivisibleByTwo){
            System.out.println("At least single number is divisible by 2");
        }else{
            System.out.println(" not a single number is divisible by 2");
        }
    }
}