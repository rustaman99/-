package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ПереводЛистаВМапИВыодОдинаоквыхЗначений {
    public static void main(String[] args) {


        List<String> names = Arrays.asList("Ruslan", "Ivan", "Stepan", "Dan", "Ruslan", "Ivan", "Stepan", "Dan", "Ivan", "Stepan", "Dan", "Ivan");
        Map<String, Long> amount =
                names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        amount.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}