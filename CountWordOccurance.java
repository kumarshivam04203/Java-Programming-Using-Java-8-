public class CountWordOccurance{
    public static void main(String[] args) {
        String str = "hi how are you and what about you";
        String word = "you";
        int count = 0;

        String temp[] = str.split(" ");
        for(int i = 0; i<temp.length; i++){
            if(word.equals(temp[i])){
                count++;
            }
        }
        System.out.println("total occurance number "+count);
    }
}