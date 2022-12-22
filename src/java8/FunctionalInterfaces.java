package java8;

import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
          Predicate<Integer> predicate= x -> x > 5;
        System.out.println(predicate.test(4));

        Consumer<Integer> consumer=x-> System.out.println(x);
        Function<Integer,String>function=x->x.toString();
        Supplier<Integer> supplier=()->new Integer(5);
        UnaryOperator<Integer>unaryOperator=x->x*x;
        BinaryOperator<Integer> binaryOperator=(x,y)->x+y;

    }
}
