package pl.camp.it.anonimowe;

import pl.camp.it.functional.App;

import java.util.function.Function;

public class MojaFunkcja implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        return App.b * integer;
    }
}
