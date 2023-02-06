public class DivideStringInNEqualParts{
    public static void main(String[] args) {
        String str = "abggjcd";
        int n = 2;
        int len = str.length();
        int stringPart = len / n;
        String[] stringParts = new String[n];
        int temp = 0;
        
        if(len % n != 0){
            System.out.println("the string can not be divide by "+n+" equal part");
        }else{
           for(int i=0; i< len; i=i+stringPart){
            String part = str.substring(i, i+stringPart);
            stringParts[temp] = part;
            temp++;
           } 
        }
        for(int i=0; i < stringParts.length; i++){
            System.out.println(stringParts[i]);
        }
    }
}