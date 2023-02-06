public class FindLengthOfLastWord{
    public static void main(String[] args) {
        String str = "hi i am shivam kumar";
        int len = 0;
        str = str.trim();

        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i) == ' '){
                break;
            }else{
                len++;
            }
        }
        System.out.println("Length of last String " +len);
    }
}