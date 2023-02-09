import java.util.Optional;

//1...// optional class in java optional is sanerio valu is present or not
import java.util.*;
public class OptionalDemo{
    public static void main(String[] args) {
//         String str =null;

//         Optional<String> optional = Optional.ofNullable(str);

//         //2...///Agar value null hai to print karane ke liye

//         //String str = null;
        // if(optional.isPresent()){
        //      System.out.println("Optional value : " +optional.get());
        // }else{
        //     System.out.println("does not optional value");
        // }

//         //3...////agar value String = "bcjdkjd" to shirf single line me kam ho jata hai
//        // System.out.println("Optional value is: "+optional.get());
// //4....Agar value does not optional value print hota hai to uske jagah defoult value ko present karana 
//        if(optional.isPresent()){
//             System.out.println("Optional value : " +optional.get());
//        }else{
//         String value = optional.orElse("defoult");
//         System.out.println("does not optional value present : "+value);
//        }

     String str = "";
     Optional<String> optional = Optional.ofNullable(str);
     if(optional.isPresent()){
        System.out.println("optional value is present ");
     }else{
        System.out.println("optional value does not present");
     }
    }
}