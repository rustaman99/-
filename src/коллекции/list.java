package коллекции;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
//список из элементов которые могут дублироваться и имеют порядок порядом добавления
        List<String> fruit = new ArrayList<>();
        //add добавить
        //вставить по индексу в середину add.add(0,"яблоко")
        fruit.add("яблоко");
        fruit.add("вишня");
        fruit.add("арбуз");
        fruit.add("яблоко");
        fruit.add(1,"Apple");
        System.out.println(fruit.size());//размер
        System.out.println(fruit);//вывод всех фруктов в массиве
        System.out.println(fruit);
        //реализация LinkedList and ArrayList
    }
}