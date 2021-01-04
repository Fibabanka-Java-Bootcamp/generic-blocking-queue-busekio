
package org.kodluyoruz;

public class Queue<T> {

    private final Node<T> head;
    private final Node<T> tail;


    public Queue() {
        head = new Node<>(null);
        tail = new Node<>(null);
        head.next = tail;
        tail.prev = head;

    }
    
    synchronized T dequeue() {
        
        notifyAll();
        Node<T> last = tail.prev;

        last.prev.next = tail;
        tail.prev = last.prev;

        T value = last.value;
        last = null;


        return value;
    }    

    synchronized void enqueue(T value) {
        
        notifyAll();
        Node<T> node = new Node<>(value);

        node.next = tail;//tail
        node.prev = head;

        head.next.prev = node;//tail.prev
        head.next = node;

    }
    
//    public boolean isEmpty() {
//
//        return size == 0;
//    }    


    synchronized public T peek() {

        notifyAll();
        return tail.prev.value;

    }


}