package java8;

import java.util.stream.Stream;

public class КакРаботаютЛямбдаВыражения {
    public static void main(String[] args) {
        Stream<String> stream=Stream.of("a","b","c");
        stream.map(s-> {
                System.out.println(s);
                return s;
    }) ;
    }
}
