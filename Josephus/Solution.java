/**
 *the class for applying circular queue.
 */
class CircularQueue {
    /**
     * the object for operations class.
     */
    private Operations obj;
    /** constructor to initialize object.
    */
    CircularQueue() {
        obj = new Operations();
    }
    /**
     *the method is to push the elements.
     *to queue.
     * @param      number  The number
     */
    public void push(final int number) {
        for (int i = 0; i < number; i++) {
            obj.insertEnd(i);
        }
    }
    /**
     * the method to perform circular.
     *queue
     * @param      number  The number
     * @param      length  The length
     */
    public String pop(final int number, final int length) {
        int[] arr = new int[length];
        Node temp = obj.head;
        int range = number;
        int counter = 0;
        int index = 0;
        while (obj.size != 0) {
            while (counter != range - 1) {
                obj.insertEnd(temp.data);
                temp = temp.next;
                obj.deleteStart();
                counter++;
            }
            arr[index++] = temp.data;
            temp = temp.next;
            counter = 0;
            obj.deleteStart();
        }
        String st = "";
        for (int i = 0; i < length - 1; i++) {
            st += arr[i] + " ";
        }
        st += arr[length - 1];
        return st;
    }
}


class Solution{
	public static String Josephus(int a, int b){
		// fill you code Here
		CircularQueue obj = new CircularQueue();
		obj.push(a);
        return obj.pop(b, a);
	}
}
