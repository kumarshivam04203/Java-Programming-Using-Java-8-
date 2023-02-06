// take the input string from the user and find duplicate characters in the given string,
// print all the characters having count > 1
import java.util.*;
public class PrintDuplicateCollectorsInString{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the String ");
        String str = sc.next();
        HashSet<Character>characterSet = new HashSet<>();

        for(char c : str.toCharArray()){
            if(characterSet.contains(c)){
                System.out.print(c + " ");
            }else{
                characterSet.add(c);
            }
        }
    }
}