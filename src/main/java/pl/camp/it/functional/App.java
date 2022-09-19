package pl.camp.it.functional;

import pl.camp.it.anonimowe.Car;

import java.util.function.*;

public class App {
    public static int b = 5;

    public static void main(String[] args) {
        Function<Integer, Double> function = (x) -> x * 2.6;

        double functionResult = function.apply(5);

        metoda(5, function);

        Function<Integer, Integer> function2 = (x) -> x*x;

        metoda(5, function2);

        System.out.println(function2.apply(5));

        BiFunction<Integer, String, String> biFunction = (i, s) -> s + i;

        System.out.println(biFunction.apply(4, "ABC"));

        UnaryOperator<Integer> unaryOperator = (i) -> i * 4;

        System.out.println(unaryOperator.apply(10));

        Predicate<Double> predicate = (d) -> {
            System.out.println("cos tam cos tam");
            System.out.println("cos robie");
            //????
            return d > 10.33;
        };

        System.out.println(predicate.test(13.33));

        Supplier<Car> supplier = () -> new Car("Defaul", "Default", 100.0);

        System.out.println(supplier.get());

        Consumer<Car> consumer = (car) -> {
            System.out.println("Zjadlem takie auto:");
            System.out.println(car);
        };

        consumer.accept(supplier.get());

        Function<Integer, Integer> exampleFunction = (i) -> App.b * i;
        System.out.println(exampleFunction.apply(5));

        App.b = 7;
        Function<Integer, Integer> exampleFunction2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return App.b * integer;
            }
        };

        System.out.println(exampleFunction.apply(5));
    }

    public static void metoda(int a, Function f) {
        int b = a * 5;
        boolean c = b > 44;
        if(c) {
            int d = a * 8;
            f.apply(d);
        } else {
            int d = 1;
            f.apply(d);
        }
    }
}
