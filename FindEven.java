import java.util.Arrays;
import java.util.List;

public class FindEven{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8);
      //even number
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
      // odd number
        numbers.stream().filter(n -> n % 2 == 1).forEach(System.out::println);
        
        // stream method use processing by each element by one by one in present input list

        //filter method used for can by except the excess condition
    }
}