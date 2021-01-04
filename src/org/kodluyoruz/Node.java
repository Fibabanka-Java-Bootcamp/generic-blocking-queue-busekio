
package org.kodluyoruz;


public class Node<T> {
    
    public final T value;
    public Node<T> prev;
    public Node<T> next;  
    
    public Node(final T value) {
        this.value = value;
        this.prev =null;
        this.next = null;
    }
    
}
