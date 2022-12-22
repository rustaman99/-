package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.Arrays.parallelPrefix;

public class Streams {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("one");
        list.add("two");
        Stream.of("one","two").sorted().collect(Collectors.toList());
        System.out.println(list);
//        int count=Stream.of(5,5,5).reduce(0,(acc,element)->acc+element);
//        System.out.println(count);//посчитать все элементы
//        for(String a:list) {         1 вариант вывода
//            System.out.println(a);
//        }
//        Iterator<String>iterator=list.iterator();  2 вариант вывода
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        Stream<String>stream=list.stream();  3 вариант вывода
//        stream.forEach(x-> System.out.println(x));
       //  list.stream().forEach(x-> System.out.println(x));
//        list.stream().filter(x-> {
//            System.out.println(x);
//            return x.equals("one");
//        }).count();
     //  Set<String>set = list.stream().collect(Collectors.toSet()); переводим лист в сет
        // list.stream().map(x->x.toUpperCase()); переводим в верхний регистр
//Stream.of(asList("One","two"),asList("three","four")).flatMap(x->x.stream());
//      int value=Stream.of(4,5).min(Comparator.comparing(x->x)).get();
//        int value2=Stream.of(3,2).max(Comparator.comparing(x->x)).get();
//        System.out.println(value2);
//
    }
}
