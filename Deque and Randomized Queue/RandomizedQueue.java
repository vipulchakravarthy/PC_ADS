import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.Random;

public class RandomizedQueue<Item> implements Iterable<Item> {

    private class Node<Item>{
        Item value;
        Node<Item> next;
        Node<Item> prev;
        Node(Item i){
            value = i;
            next = null;
            prev = null;
        }
    }

    private Node<Item> head;
    private Node<Item> tail;
    private int size;
    // construct an empty randomized queue
    public RandomizedQueue(){
        head = null;
        tail = null;
        size = 0;
    }

    // is the randomized queue empty?
    public boolean isEmpty(){
        return size == 0;
    }
    // return the number of items on the randomized queue
    public int size(){
        return size;
    }
    // add the item
    public void enqueue(Item item){
        if(item == null){
            throw new IllegalArgumentException();
        }
        Node<Item> obj = new Node<>(item);
        if (head == null && tail == null) {
            head = obj;
            tail = obj;
        } else {
            tail.next = obj;
            obj.prev = tail;
            tail = obj;
        }
        size++;
    }
    // remove and return a random item
    public Item dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Random rand = new Random();
        int index = rand.nextInt(size);
        Node<Item> temp = head;
        int i = 0;
        while(i < index ){
            temp = temp.next;
            i++;
        }
        if (tail == temp && temp == head){
            head = null;
            tail = null;
        }
        else if (temp == head){
            head = temp.next;
        }
        else if(temp == tail){
            tail = tail.prev;
            tail.next = null;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        // Change prev only if node to be deleted
        // is NOT the first node
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        size--;
        return temp.value;
    }

    // return a random item (but do not remove it)
    public Item sample(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Random rand = new Random();
        int index = rand.nextInt(size);
        Node<Item> temp = head;
        int i = 0;
        while(i < index){
            temp = temp.next;
            i++;
        }
        return temp.value;
    }
    // return an independent iterator over items in random order
    public Iterator<Item> iterator(){
        return new ListIterator<Item>(head);
    }

    private class ListIterator<Item> implements Iterator<Item> {
            private Node<Item> current;

            public ListIterator(Node<Item> first) {
                current = first;
            }

            public boolean hasNext() {
                return current != null;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }

            public Item next() {
                if (!hasNext()) throw new NoSuchElementException();
                // Random random = new Random();
                // int index = random.nextInt(size);
                Node<Item> temp = current;
                // int i = 0;
                // while(i < index){
                temp = temp.next;
                // i++;
                //
            	return temp.value;
            }
        }

    // unit testing (required)
    public static void main(String[] args){
        // unit testing (required)
        // sequence of dequeue operations was:
         RandomizedQueue<Integer> rq = new RandomizedQueue<Integer>();
         rq.enqueue(26);
         rq.dequeue();     //==> 26
         rq.size();       //==> 0
         rq.size();        //==> 0
         rq.isEmpty();    //==> true
         rq.isEmpty() ;    //==> true
         rq.size();        //==> 0
         rq.size() ;       //==> 0
         rq.size();        //==> 0
         rq.enqueue(30);
         rq.dequeue();
    }
}
