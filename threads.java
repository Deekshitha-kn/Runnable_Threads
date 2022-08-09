class MyThreadRunnable implements Runnable {
    public void run() {
        System.out.println("This is my first runnable thread");
    }
}

class MyThreadRunnable2 implements Runnable {
    public void run() {
        System.out.println("Second runnable thread");
    }
}

public class threads {
    public static void main(String[] args) {
        MyThreadRunnable t1 = new MyThreadRunnable();
        Thread rt1 = new Thread(t1);

        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread rt2 = new Thread(t2);

        rt1.start();
        rt2.start();
    }
}