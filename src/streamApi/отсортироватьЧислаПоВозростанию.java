package streamApi;

import java.util.Comparator;
import java.util.stream.Stream;

public class отсортироватьЧислаПоВозростанию {
    public static void main(String[] args) {
                Stream.of(120, 410, 85, 32, 314, 12)
               .sorted(Comparator.naturalOrder())// от меньшего к большему
                        // .sorted(Comparator.reverseOrder())//вывод от большего к меньшему
                .forEach(System.out::println);
    }
}
