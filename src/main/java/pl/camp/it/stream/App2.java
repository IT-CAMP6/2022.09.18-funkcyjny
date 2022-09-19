package pl.camp.it.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "ala",
                "Janusz",
                "cos cos",
                "ABC",
                "jakis.string",
                "costam",
                "asdfg asd",
                "sdf,sdf");

        //List<String> result = new ArrayList<>();

        int sum = 0;
        int count = 0;
        for(String element : strings) {
            if(element.equals(element.toLowerCase()) && !element.contains(" ")) {
                //result.add(element.replace(".", "").replace(",", ""));
                String result = element.replace(".", "").replace(",", "");
                sum += result.length();
                count++;
            }
        }

        double result = ((double) sum) / ((double) count);

        System.out.println(result);

        double result2 = strings.stream()
                .filter(s -> !s.contains(" "))
                .filter(s -> s.equals(s.toLowerCase()))
                .map(s -> s.replace(".", ""))
                .map(s -> s.replace(",", ""))
                .mapToInt(String::length)
                .average().getAsDouble();

        System.out.println(result2);
    }
}
