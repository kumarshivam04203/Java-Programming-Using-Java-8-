import java.util.*;
public class PrintSquareTheList{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,6,7);
////square of each element

       // list.stream().mapToInt(n -> n*n).forEach(System.out::println);

////Print grater than or equals to 100
        //list.stream().mapToInt(n -> n*n).filter(n -> n>=100).forEach(System.out::println);

////average of grater than or equals to 100

        OptionalDouble opt = list.stream().mapToInt(n -> n*n).filter(n -> n>=100).average();

        //agar list me koi qualify element 100 ke nhi hai to 
        if(opt.isPresent()){
             System.out.println("Average is : "+opt.getAsDouble());
        }else{
            System.out.println("no qualify element");
        }
    }
}