package pl.camp.it.anonimowe;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(2);
        list.add(0);
        list.add(10);
        list.add(7);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        List<String> list2 = new ArrayList();

        list2.add("Janusz");
        list2.add("Bartek");
        list2.add("Karol");
        list2.add("Adam");

        System.out.println(list2);

        Collections.sort(list2);

        System.out.println(list2);

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "3", 300.00));
        carList.add(new Car("Toyota", "Corolla", 100.00));
        carList.add(new Car("Audi", "A3", 200.00));
        carList.add(new Car("Renault", "Laguna", 70.00));

        System.out.println(carList);

        /*Collections.sort(carList, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });*/

        Collections.sort(carList, (c1, c2) -> (int) (c1.getPrice() - c2.getPrice()));

        System.out.println(carList);

        Collections.sort(carList, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });

        System.out.println(carList);

        Collections.sort(carList, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });

        System.out.println(carList);

        /*Car c1 = new Car();
        Car c2 = new Car();

        c1.compareTo(c2);*/

        //Optional<CarChild> car = opakowywaczSamochodow(new CarChild());
    }

    public static <T extends Car> Optional<T> opakowywaczSamochodow(T parametr) {
        return Optional.of(parametr);
    }

    public static int metoda2(String parametr) {
        return 4;
    }
}
