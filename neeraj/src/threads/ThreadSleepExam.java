package threads;

class ThreSleep1 extends Thread{
    public void run(){
        int i=0;
        /*while(i<20){
            try{
                Thread.sleep(300);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning!.");
            i++;
        }*/
    }

}
class ThreSleep2 extends Thread{
    public void run(){
        int j =0;
        while(j<40){
            try{
                Thread.sleep(300);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println("welcom !.");
            j++;
        }
    }
}
public class ThreadSleepExam {
    public static void main(String[] args) {
        ThreSleep1 ts1 = new ThreSleep1();
        ThreSleep2 ts2 = new ThreSleep2();

        //ts1.setPriority(3);
        //ts2.setPriority(6);

        System.out.println(ts1.getPriority());
        System.out.println(ts2.getPriority());
        System.out.println(ts2.getState());

        ts1.start();
        ts2.start();
        System.out.println(ts2.getState());
        System.out.println(ts2.currentThread().getState());

    }
}
