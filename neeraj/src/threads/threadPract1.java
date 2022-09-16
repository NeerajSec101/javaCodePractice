package threads;


class Thread1 extends  Thread{
    public void run(){
        int  i=1;
        while(i<10){
            System.out.println("Good Morning!");
            i++;
        }

    }
}
class Thread2 extends Thread{
    public void run(){
        int j =1;
        while(j<20){
            System.out.println("Thank You!");
            j++;
        }
    }
}
public class threadPract1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();


    }
}
