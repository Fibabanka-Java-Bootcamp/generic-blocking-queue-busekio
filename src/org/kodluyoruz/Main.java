package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();


        try {
            myThread1.join();
            Thread.sleep(50);
            myThread2.join();
            Thread.sleep(50);

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted oldu...");
        }
        System.out.println("Main thread bitti...");
    }
}
