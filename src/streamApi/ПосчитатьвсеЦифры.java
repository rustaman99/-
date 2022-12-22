package streamApi;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class ПосчитатьвсеЦифры {
    public static void main(String[] args) {
//        IntStream num = IntStream.of(5,5,5,5,6);
//        //System.out.println(num.sum());
//        System.out.println(num.max());

        List<Integer> nuberSum=Arrays.asList(5,5,5,5,5);
         Optional<Integer> sum=nuberSum.stream()
                 .reduce((a,b)->a+b);
           System.out.println(sum);

    }
}
