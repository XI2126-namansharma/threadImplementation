package threadImpl;

class ThreadExtend extends Thread{
    public void run() {
        try {
            System.out.println("Thread "+ Thread.currentThread().getId()+" is running");
        } catch(Exception e) {
            System.out.println("Exception is found");
        }
    }
}

class ThreadImplement implements Runnable{
    public void run() {
        try {
            System.out.println("Thread  "+ Thread.currentThread().getId()+" is running");
        } catch(Exception e) {
            System.out.println("Exception is found");
        }
    }
}

public class DeadlockImpl {
    public static void main(String[] args) throws InterruptedException {
        Thread objectForExt=new Thread(new ThreadExtend());
        objectForExt.start();
        Thread objectForImpl=new Thread(new ThreadImplement());
        objectForImpl.start();
    }
}
