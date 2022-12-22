package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ВывестиВсеСловаНачинаютсяНаОпределеннуюБкву {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Smith", "Ruslan", "Catley", "Sie");
            Predicate<String> nameStartsWithS = str -> str.startsWith("S");
            names.stream().filter(nameStartsWithS).forEach(System.out::println);
    }
}
