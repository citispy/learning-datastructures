package adt;

//This forms part of the abstract data type exercise for this course.

public class App {
    public static void main(String args[]){
        Counter counter = new Counter("myCounter");
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println(counter.getCurrentValue());
        System.out.println(counter.toString());
    }
}
