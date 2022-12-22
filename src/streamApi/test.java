package streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Ruslan","Ivan","Stepan","Ruslan","Ivan","Stepan","Den,Ben");
        names.stream()
                .filter(s->s.startsWith("R"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        System.out.println(names);
    }
}
