package многопоточность;

public class синхронизация {
    public static void main(String[] args) throws InterruptedException {
        Resource resourse=new Resource();//создаем объект ресурс
        resourse.i=5;//задаем начальное значение

        MyThread myThread=new MyThread(); //создаем поток myThread
        MyThread myThread1=new MyThread();//создаем поток myThread1

        myThread.setResource(resourse); //засовываем ресурс
        myThread1.setResource(resourse);//засовываем ресурс

        myThread.start();//запусткаем поток
        myThread1.start();//запускаем поток

        myThread.join(); //используется для объединения начала выполнения одного потока с завершением выполнения другого потока
        myThread1.join();//используется для объединения начала выполнения одного потока с завершением выполнения другого потока

        System.out.println(resourse.i);
    }
}
class MyThread extends Thread{
    public void setResource(Resource resource) {
        this.resource = resource;
    }
    Resource resource;
    @Override
    public void run() {
resource.changeI();
    }
}
class Resource{
    int i;
    public synchronized  void   changeI(){
        int i=this.i;
        i++;
        this.i=i;

    }
}