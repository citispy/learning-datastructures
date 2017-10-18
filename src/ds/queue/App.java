package ds.queue;
//This exercise forms part of the Queues exercise in this course
//Here we are creating a circular queue. As you can see below the size of the queue is 5, but we are adding 7 items to the queue
//The 6th and 7th item replaces the 1st and 2nd items. That is why it's called a circular queue

public class App {
    public static void main(String[] args){
        Queue myQueue = new Queue(5);
        myQueue.insert(100);    //1
        myQueue.insert(1000);   //2
        myQueue.insert(14);     //3
        myQueue.insert(12);     //4
        myQueue.insert(44);     //5
        myQueue.insert(33);     //6
        myQueue.insert(21);     //7

        myQueue.view();
    }
}
