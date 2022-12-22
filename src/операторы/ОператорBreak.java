package операторы;

public class ОператорBreak {
    public static void main(String[] args) {

        //break позволяет  выйти из цикла в любой его момент
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
                 System.out.println(i);
            }
        }
    }