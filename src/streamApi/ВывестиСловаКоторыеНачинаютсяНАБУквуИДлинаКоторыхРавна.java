package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ВывестиСловаКоторыеНачинаютсяНАБУквуИДлинаКоторыхРавна {
    public static void main(String[] args) {
        List<String> name= Arrays.asList("Ruslan","Dana","Ben","Den");
        Predicate<String> nameStartsD= s -> s.startsWith("D");
        Predicate<String> length = s->s.length() >=4;
        name.stream()
                .filter(nameStartsD.and(length))
                .forEach(s -> System.out.println(s));
    }
}
