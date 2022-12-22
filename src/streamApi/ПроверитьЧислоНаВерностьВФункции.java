package streamApi;

import java.util.function.Predicate;

public class ПроверитьЧислоНаВерностьВФункции {
    public static void main(String[] args) {
        Predicate<Integer> predicate= x -> x > 5;
        System.out.println(predicate.test(6));
    }
}
