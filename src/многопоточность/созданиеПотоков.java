package многопоточность;

public class созданиеПотоков {
    public static void main(String[] args) {
        MyThread thread =new MyThread();
        thread.start();

        MyRunnable myRunnable=new MyRunnable();
        Thread thread1=new Thread(myRunnable);
        thread1.start();


    }
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello Mythread this is a first thread");
        }
    }

        static  class MyRunnable implements Runnable{

            @Override
            public void run() {
                System.out.println("Hello MyRunnable this is a second thread");
            }
        }
    }