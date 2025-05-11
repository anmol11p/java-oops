
//by the help of class extending thread 
class A extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("anmol");
        }
    }
}

// by the help of implements runnable
class B implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("anmol");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // A t =new A();
        // t.start();

        B ref = new B();
        Thread t = new Thread(ref);
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("anubhav");
        }
    }
}
