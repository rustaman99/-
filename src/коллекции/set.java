package коллекции;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
      Set<String > fruit=new HashSet<>();
       //реализация HashSet -он хранит мапу внутри себя,произвольный порядок добавление
        // LikedHashSet -сохраняет порядок добавления
        // TreeSet-(содержит в себе дерево) сортировака по красно черному дереву(по алфавиту или возрастанию)
      //сет не допускает дублей,не сохраняет порядок добавления
        fruit.add("Яблоко");
        fruit.add("вышня");
        fruit.add("арбуз");
        fruit.add("Яблоко");
        System.out.println(fruit);
        System.out.println(fruit.size());

    }
}
