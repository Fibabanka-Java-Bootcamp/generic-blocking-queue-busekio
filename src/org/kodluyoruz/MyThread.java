
package org.kodluyoruz;

public class MyThread extends Thread {
    
     Queue<Integer> myQuee = new Queue();
     Queue<String> myQuee2 = new Queue();
    
    @Override
    public void run(){

        //myQuee.dequeue();
        myQuee.enqueue(1);
        myQuee.enqueue(2);
        myQuee.enqueue(3);
        myQuee.enqueue(4);

        System.out.println("peek : " + myQuee.peek());

        System.out.println("-----------------------------");

        System.out.println("dequeue : " + myQuee.dequeue());
        System.out.println("dequeue : " + myQuee.dequeue());


        System.out.println("-----------------------------");

        System.out.println(myQuee.peek());

        System.out.println("-----------------------------");
        
        //String
        
        myQuee2.enqueue("abc");
        myQuee2.enqueue("avs");
        myQuee2.enqueue("ans");
        myQuee2.enqueue("mkj");

        System.out.println("peek : " + myQuee2.peek());

        System.out.println("-----------------------------");

        System.out.println("dequeue : " + myQuee2.dequeue());
        System.out.println("dequeue : " + myQuee2.dequeue());

        System.out.println("-----------------------------");

        System.out.println("peek : " + myQuee2.peek());
    
    
    }
    
    
    
}
