package java8;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParallelMain {
    public static void main(String[] args) {
//        Stream stream= Stream.of(1,2,3).parallel();
//        List list=new ArrayList<>();
//        list.parallelStream();

        List<Integer> integers =new ArrayList<>();
        for (int i=0;i<10_000_000;i++){
            integers.add(i);
            integers.add(10_000_000 - i);
        }
        System.out.println(new Date());
        integers.parallelStream().sorted().filter(x->x%2==0).map(x->new double[x]).forEach(x->x.toString());
        //integers.parallelStream().sorted().count();
        System.out.println(new Date());
    }
}
