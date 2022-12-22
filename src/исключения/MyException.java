package исключения;

public class MyException extends  Exception{
    public MyException(String s) {
        System.out.println(" Деление на 0");
    }
}
