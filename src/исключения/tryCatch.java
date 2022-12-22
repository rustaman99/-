package исключения;

public class tryCatch {
    public static void main(String[] args) {
      calculation(5,0);
    }
     static void calculation(int a, int b){
        try {
            System.out.println(a/b);
        }catch (ArithmeticException | NullPointerException exception){
            exception.printStackTrace();
            //System.out.println("Деление на 0");
        }finally {
            System.out.println("Введите верное число ");
        }
    }
}
