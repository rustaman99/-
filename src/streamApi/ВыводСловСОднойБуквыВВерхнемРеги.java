package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ВыводСловСОднойБуквыВВерхнемРеги {
    public static void main(String[] args) {
        List<String > names= Arrays.asList("ruslan","rubi","anton","stepan","vasul","arik","anatol");

        names.stream()
                .filter(s->s.startsWith("r"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        List<String > name= Arrays.asList("ruslan","rubi","Anton","stepan","vasul","Arik","Anatol");

        name.stream()
                .filter(s->s.startsWith("A"))
                .map(String::toLowerCase)
                .sorted()
                .forEach(System.out::println);

        List<Integer> number=Arrays.asList(5,3,1,5,6,5,4,3,5,6,3,2,5,6);
        number.stream()
                .distinct()
                .sorted()
                .limit(5);

      number.stream().forEach(System.out::println);


        IntStream.range(1,100)
                .forEach(System.out::println);
    }
}
