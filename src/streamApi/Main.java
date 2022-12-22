package streamApi;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons= Arrays.asList(
                new Person("Andrew",20),
                new Person("Igor",23),
                new Person("Ira",23),
                new Person("Vitya",12));
//аналитика всего листа
        IntSummaryStatistics ageSummary=persons.stream()
                .collect(Collectors.summarizingInt(p->p.age));
        System.out.println(ageSummary);

        //..вывод имен которые начинаются на И и перевод в лист
//List<Person> filtered=persons.stream()
//        .filter(p->p.name.startsWith("I"))
//        .collect(Collectors.toList());//вывод в лист
//        System.out.println(filtered);


        //вывод возраста и чей он
//        Map<Integer,List<Person>> personByAge=persons.stream()
//                .collect(Collectors.groupingBy(p->p.age));
//        personByAge.forEach((age,p)-> System.out.format("age %s: %s\n" ,age ,p));


        // вывести средний возраст
//        Double averageAge=persons.stream()
//                .collect(Collectors.averagingInt(p->p.age));
//        System.out.println(averageAge);



    }
}
