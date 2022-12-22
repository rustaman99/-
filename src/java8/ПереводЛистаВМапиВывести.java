package java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ПереводЛистаВМапиВывести {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Ruslan","stepan","Ivan","Ruslan","Ruslan");

        Map<String,Long>map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.forEach((k,v)-> System.out.println(k+ ": " + v));

    }
}
