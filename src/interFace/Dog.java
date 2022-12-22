package interFace;

public class Dog implements Go{
    public static void main(String[] args) {
        Dog dog = new Dog();
       dog.go();

    }
    @Override
    public void go() {
        System.out.println("Dog is go to swim");
    }
}
