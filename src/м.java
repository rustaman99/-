import java.util.Arrays;
import java.util.List;

public class м {
    public static void main(String[] args) throws InterruptedException {

    List<String> people = Arrays.asList("Tom","Bob", "Sam", "Kate", "Tim");
        Thread.sleep(500);
    System.out.println("Последовательный поток");
    people.stream().filter(a->a.length()==4).forEach(System.out::println);

    System.out.println("\nПараллельный поток");
    people.parallelStream().filter(a->a.length()==4).forEach(System.out::println);
   }
}