public class Queue {
    int size = 5;
    int arr[] = new int[size];
    int front, rear;

    Queue() {
        front = rear = -1;
    }

    boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        }
        return false;
    }

    void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = item;
            System.out.println("Inserted " + item);
        }
    }

    int dequeue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return (-1);
        } else {
            element = arr[front];
            if (front >= rear) {
                front = rear = -1;
            } else {
                front++;
            }
            System.out.println("Popped element :" + element);
            return (element);
        }
    }

    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front Index :" + front);
            System.out.print("Queue :");
            for (i = front; i <= rear; i++) {
                System.out.println(arr[i] + " ");
            }
            System.out.println("Rear Index :" + rear);
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        // q.dequeue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        // q.display();
        q.dequeue();
        q.display();
    }
}
