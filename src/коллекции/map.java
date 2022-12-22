package коллекции;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        //HashMap-произвольный порядок добавления
        //LinkedHashMap-сохраняется порядок добавления
        //TreeMap-сортировка по ключу в алфавитном порядке
        Map<String,Integer> fruits =new HashMap<>();
        fruits.put("яблоко",6);
        fruits.put("ананас",6);
        fruits.put("вишня",5);
        fruits.put("яблоко",4);
        System.out.println(fruits);
    }
}
