import java.util.Arrays;

// find the java program to largest number from the given array

public class FindLargestNumberInArrays{
    public static void main(String[] args) {
        int array[]= new int[] {10,22,43,54,24,60};
        int largestNumber;

        // Arrays.sort(array);
        // largestNumber = array[array.length-1];
        // System.out.println("largest number the array " +largestNumber);

        largestNumber = array[0];
        for(int i=0; i<array.length; i++){
            if(largestNumber<array[i]){
                largestNumber = array[i];
            }
        }
        System.out.println("Print the largest number " + largestNumber);
    }
}