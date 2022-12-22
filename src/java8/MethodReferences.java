package java8;

import java.util.stream.Stream;

public class MethodReferences {
    public static void main(String[] args) {
        Stream.of("one","two").map(x->x.toUpperCase());
        Stream.of("one","two").map(String::toUpperCase);
        Stream.of(new Student("Max"),new Student("Bob")).map(x->x.getName()).forEach(x-> System.out.println(x));
        Stream.of(new Student("Max"),new Student("Bob")).map(Student::getName).forEach(System.out::println);
        Stream.of("Jhon","Edd").map(Student::new).forEach(x-> System.out.println(x.getName()));

    }
}
class Student{
    String name;
    public Student(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}