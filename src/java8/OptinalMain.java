package java8;

import java.util.Optional;

public class OptinalMain {
    public static void main(String[] args) {
//        Optional<String> optional=Optional.empty();
//        Optional<String> optional2=Optional.ofNullable(null);
Optional<String> optional=get0();
if(optional.isPresent()) {
    System.out.println(optional.get());
}
    }
    static Optional<String> get0(){
        if(false){
            return Optional.of("hello");
        }
        return Optional.empty();
    }
}
