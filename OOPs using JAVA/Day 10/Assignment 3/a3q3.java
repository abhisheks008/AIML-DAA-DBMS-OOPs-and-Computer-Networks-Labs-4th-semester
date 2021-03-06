// Write a Java program to implement Queue using array.

// Author : Abhishek Sharma
class Queue { 
    private static int front, rear, capacity; 
    private static int queue[]; 

    Queue(int c) 
    { 
        front = rear = 0; 
        capacity = c; 
        queue = new int[capacity]; 
    } 

    static void queueEnqueue(int data) 
    { 

        if (capacity == rear) { 
            System.out.printf("\nQueue is full\n"); 
            return; 
        } 
        else { 
            queue[rear] = data; 
            rear++; 
        } 
        return; 
    } 
    static void queueDequeue() 
    { 
        if (front == rear) { 
            System.out.printf("\nQueue is empty\n"); 
            return; 
        } 
        else { 
            for (int i = 0; i < rear - 1; i++) { 
                queue[i] = queue[i + 1]; 
            } 
            if (rear < capacity) 
                queue[rear] = 0; 
            rear--; 
        } 
        return; 
    } 
    static void queueDisplay() 
    { 
        int i; 
        if (front == rear) { 
            System.out.printf("\nQueue is Empty\n"); 
            return; 
        } 
        for (i = front; i < rear; i++) { 
            System.out.printf(" %d <-- ", queue[i]); 
        } 
        return; 
    } 
    static void queueFront() 
    { 
        if (front == rear) { 
            System.out.printf("\nQueue is Empty\n"); 
            return; 
        } 
        System.out.printf("\nFront Element is: %d", queue[front]); 
        return; 
    } 
} 

public class a3q3 { 

    // Driver code 
    public static void main(String[] args) 
    { 
        // Create a queue of capacity 4 
        Queue q = new Queue(4); 

        // print Queue elements 
        q.queueDisplay(); 

        // inserting elements in the queue 
        q.queueEnqueue(20); 
        q.queueEnqueue(30); 
        q.queueEnqueue(40); 
        q.queueEnqueue(50); 

        // print Queue elements 
        q.queueDisplay(); 

        // insert element in the queue 
        q.queueEnqueue(60); 

        // print Queue elements 
        q.queueDisplay(); 

        q.queueDequeue(); 
        q.queueDequeue(); 
        System.out.printf("\n\nafter two node deletion\n\n"); 

        // print Queue elements 
        q.queueDisplay(); 

        // print front of the queue 
        q.queueFront(); 
    } 
} 

/*
Output :
Queue is Empty
 20 <--  30 <--  40 <--  50 <--
Queue is full
 20 <--  30 <--  40 <--  50 <--

after two node deletion

 40 <--  50 <--
Front Element is: 40
*/
