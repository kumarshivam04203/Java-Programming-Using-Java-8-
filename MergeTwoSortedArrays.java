import java.util.Arrays;

//Write a java program to Merge a 2 Sorted array using java 8 

public class MergeTwoSortedArrays{
    public static void main(String[] args) {
        int array1[] = {10,11,43,5,63,55};
        int array2[] = {9,2,4,6,18};
        
        int finalArray[] = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, finalArray, 0, array1.length);
        System.arraycopy(array2, 0, finalArray, array1.length, array2.length);

        Arrays.sort(finalArray);
        for(int element: finalArray){
            System.out.print(element+" ");
        }
    }
}