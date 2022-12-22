package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class CollectorMain {
    public static void main(String[] args) {
        //collect позволяет первращать стрим в любую коллекцию
        Stream.of("one","two").collect(Collectors.toCollection(ArrayList::new)); //превращаем в ArrayList
        Stream.of("one","two").collect(Collectors.toCollection(TreeSet::new));//превращаем в  TreeSet
        Stream.of("one","two").collect(maxBy(Comparator.comparing(x->x))); //ищем максимальное число
        Stream.of(1,2).collect(averagingInt(x -> x)); //ищем среднее из чисел
        Map<Boolean, List<Integer>> map=Stream.of(1,2,3,4,5,6).collect(partitioningBy(x->x>2));
        System.out.println(map);
        String result=Stream.of("one","two","three").collect(joining(",","{","}"));
        System.out.println(result);
        Map<Integer,Long> map3=Stream.of(1,2,3,4,3,2,3,2,2,2,2).collect(groupingBy(x->x, counting()));
        System.out.println(map3.get(2));

    }
}
