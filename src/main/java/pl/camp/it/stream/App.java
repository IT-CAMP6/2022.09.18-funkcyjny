package pl.camp.it.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> filteredNumbers = new ArrayList<>();

        for(Integer element : numbers) {
            if(element > 3 && element < 7) {
                filteredNumbers.add(element);
            }
        }

        System.out.println(filteredNumbers);

        Function<Integer, String> funkcja;
        List<String> filteredList2 = numbers.stream()
                .filter(i -> i > 3)
                .filter(i -> i < 7)
                .peek(System.out::println)
                .map(i -> i+"")
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(filteredList2);

        numbers.stream().forEach(n -> System.out.println(n*10));

        for(Integer element : numbers) {
            System.out.println(element * 10);
        }

        Integer suma = numbers.stream().reduce(0, Integer::sum);
        System.out.println(suma);
    }
}
