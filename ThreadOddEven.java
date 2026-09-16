class OddThread extends Thread {

    public void run() {
        for (int i = 1; i <= 11; i += 2) {
            System.out.println("Odd number: " + i);
        }
    }
}

public class ThreadOddEven {

    public static void main(String[] args) {

        OddThread t1 = new OddThread();

        t1.start();
    }
}