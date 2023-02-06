// find the frequency of each word in the given list and print only those words
//which are having count >= 2 using java 8

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;
public class FrequencyofWordsInList{
    public static void main(String[] args) {
        List <String> names = Arrays.asList("AA","BB","CC","DD","AA","DD","AA");

        Map<String, Long> wordsCountMap = names.stream().filter(word -> Collections.frequency(names, word) > 1)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("words having count >= 2");
        System.out.println(wordsCountMap);
    }
}