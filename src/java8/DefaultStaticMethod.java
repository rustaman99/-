package java8;

import java.util.ArrayList;
import java.util.List;

public class DefaultStaticMethod {
    public static void main(String[] args) {
A a=new B();
a.sayHello();
    }
}
interface A{
   void printMessage(String message);
     default  void sayHello(){
       printMessage("hello");
   }
}
class B implements A{

    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }
    @Override
    public void sayHello(){
        printMessage("new hello");
    }
}