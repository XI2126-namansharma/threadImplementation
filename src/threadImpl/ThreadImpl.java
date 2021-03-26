package threadImpl;

class ThreadMain extends Thread{
    public void run() {
        try {
            System.out.println("Thread "+ Thread.currentThread().getId()+" is running");
        } catch(Exception e) {
            System.out.println("Exception is found");
        }
    }
}
class ThreadMain2 implements Runnable{
    public void run() {
        try {
            System.out.println("Thread  "+ Thread.currentThread().getId()+" is running");
        } catch(Exception e) {
            System.out.println("Exception is found");
        }
    }
}
public class ThreadImpl {
    public static void main(String[] args) {
        {
            int n=8;
            for(int i=0; i<n; i++) {
                Thread object=new Thread(new ThreadMain());
                object.start();
            }
            for(int i=0; i<n; i++) {
                Thread object=new Thread(new ThreadMain2());
                object.start();
            }
        }
    }
}