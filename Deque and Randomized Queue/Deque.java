import java.util.NoSuchElementException;
import java.util.Iterator;

public class Deque<Item>  implements Iterable<Item>
{
	private class Node<Item>
	{
		Item value;
		Node<Item> next;
		Node<Item> prev;
		Node(Item i)
		{
			value = i;
			next = null;
			prev = null;
		}
	}
	private Node<Item> head;
	private Node<Item> tail;
	private int size;
	public Deque()
	{
		head = null;
		tail = null;
		size = 0;
	}

	public boolean isEmpty()
	{
		return size == 0;
	}

	public int size()
	{
		return size;
	}

    // add the item to the front
    public void addFirst(Item item)
    {
    	if(item == null)
    	{
    		throw new IllegalArgumentException();
    	}
    	Node<Item> obj = new Node<>(item);
    	if (head == null && tail == null)
    	{
    		head = obj;
    		tail = obj;
    	} else {
    		obj.next = head;
    		head.prev = obj;
    		head = obj;
    	}
    	size++;
    }

    // add the item to the back
    public void addLast(Item item)
    {
    	if(item == null)
    	{
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

    // remove and return the item from the front
    public Item removeFirst()
    {
    	if(isEmpty())
    	{
    		throw new NoSuchElementException();
    	}
    		Node<Item> temp = head;
    		head = head.next;
    		if(head != null){
    			head.prev = null;
    		} else {
    			tail = null;
    		}
    		size--;
    		return temp.value;
    }

    // remove and return the item from the back
    public Item removeLast()
    {
    	if(isEmpty())
    	{
    		throw new NoSuchElementException();
    	}
    	Node<Item> temp = tail;
    	tail = tail.prev;
    	if(tail != null){
    			tail.next = null;
    	} else {
    		head = null;
    	}
    	size--;
    	return temp.value;
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator()
    {
    	return new ListIterator<Item>(head);
    }

    private class ListIterator<Item> implements Iterator<Item>
    {
            private Node<Item> current;

            public ListIterator(Node<Item> first)
            {
                current = first;
            }

            public boolean hasNext()
            {
                return current != null;
            }

            public void remove()
            {
                throw new UnsupportedOperationException();
            }

            public Item next()
            {
                if (!hasNext()) throw new NoSuchElementException();
                Item item = current.value;
                current = current.next;
                return item;
            }
    }
   // unit testing (required)
    public static void main(String[] args){
    	//I will not run main
         // Deque<Integer> deque = new Deque<Integer>();
         // deque.isEmpty();         //==> true
         // deque.isEmpty() ;        //==> true
         // deque.addFirst(3);
         // deque.removeLast();   //   ==> 3
         // deque.isEmpty();       //  ==> true
         // deque.addFirst(6);
         // deque.removeLast();
    }
}
