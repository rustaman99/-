package исключения;

public class throwException {
    public static void main(String[] args) {
        int a=6;
        int b=0;
        try {
            if (b == 0) throw new MyException("Деление на 0");
            System.out.println(a / b);
        } catch (MyException e) {
            e.printStackTrace();
        } finally {
            System.out.println(" Введите не 0 значение");
        }

    }
}
