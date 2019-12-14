public class MyCircularQueue {
    //保留一个位置
    private int[] array;
    //front: 队头元素的位置
    private int front;
    //rear: 队尾元素的下一个位置
    private int rear;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        array = new int[k + 1];
        front = rear = 0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        //判断队列是否已满
        if(isFull())
            return false;
        //尾插
        array[rear++]= value;
        //判断位置是否越界，更新位置
        rear = rear % array.length;
        //if(rear == array.length)
        //    rear = 0;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        //判断队列是否为空
        if(isEmpty())
            return false;
        //头删，向后移动队头的位置
        front++;
        //判断位置是否越界，更新位置
        front = front % array.length;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty())
            return -1;
        return array[front];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty())
            return -1;
        //队尾元素在 rear-1的位置
        if(rear == 0)
            return array[array.length - 1];
        return array[rear - 1];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return front == rear;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (rear + 1) % array.length == front;
    }


    public static void main(String[] args) {
        MyCircularQueue mc = new MyCircularQueue(3);
        mc.enQueue(1);
        mc.enQueue(2);
        mc.enQueue(3);
        mc.enQueue(4);
        System.out.println(mc.rear);
        System.out.println(mc.isFull());
        mc.deQueue();
        mc.enQueue(4);
        System.out.println(mc.rear);
    }
}
