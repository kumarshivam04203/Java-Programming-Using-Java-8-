// write a java program to separate a Positive and Negative numbers from arrays 
//and print and count positive and negative numbers for using java 8 
import java.util.*;
public class SeparatePositiveNegativeNumbers{
    public static void main(String[] args) {
        int arrays[] = {2,3,-32,5,-1,6,-7,7,19,-45,55};
        int positiveNumberArray[] = new int[10];
        int negativeNumberArray[] = new int[10];
        int positiveNumberCount = 0, negativeNumberCount = 0;

        for (int i=0; i<arrays.length; i++){
            if(arrays[i] < 0){
                negativeNumberArray[negativeNumberCount] = arrays[i];
                negativeNumberCount++;
            }else{
                positiveNumberArray[positiveNumberCount] = arrays[i];
                positiveNumberCount ++;
            }
            
        }
        System.out.println("total positive number " +positiveNumberCount);
        System.out.println("total negative number "+ negativeNumberCount);

        System.out.println("positive array element");
        printArrayElement(positiveNumberArray, positiveNumberCount);

        System.out.println("negative array element ");
        printArrayElement(negativeNumberArray, negativeNumberCount);

    }
    public static void printArrayElement(int array[], int size){
        for(int i=0; i<size; i++){
            System.out.println(array[i]+" ");
        }
    }
}