public class CountNumberOfCharInString{
    public static void main(String[] args) {
        String str = "agd, hug, ab";
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' ' && str.charAt(i) != ','){
                count++;
            }
        }
        System.out.println("total number of count the string : " +count);
    }
}