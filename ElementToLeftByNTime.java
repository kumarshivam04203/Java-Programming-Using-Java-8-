public class ElementToLeftByNTime{
    public static void main(String[] args) {
        int [] arr =new int[] {3,2,4,1,5,6};
        int n=4;

        for(int i=0; i<n; i++){
            int first = arr[0],j;

            for(j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}