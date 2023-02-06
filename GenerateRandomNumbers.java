// Java Program to print N random numbers using java 8

import java.util.*;
public class GenerateRandomNumbers{
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter the number of random number to the generated");
    //     int n = sc.nextInt();

    //     Random random = new Random();
    //     random.ints(1, 100).limit(n).forEach(System.out :: println);
    // }

    // java program to count strings whose length is grater than 5 int the given list
    
    public static void main(String[] args) {
        List <String> stringList = Arrays.asList("welcome", " to","count","cloudtech","java","interview","coding");

        Long count = stringList.stream().filter(str -> str.length()>5).count();
        System.out.println("String count is grater than 5 digit : " +count);
    }
}