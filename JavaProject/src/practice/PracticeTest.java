package practice;

import java.util.ArrayList;

public class PracticeTest<T> {

    private ArrayList<T> queue = new ArrayList<>();

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if(queue.isEmpty()) {
            return null;
        }
        queue.get(0);
        return queue.remove(0);
    }
    public static void main(String[] args) {

        PracticeTest<Integer> practiceTest = new PracticeTest();

        practiceTest.enqueue(1);
        practiceTest.enqueue(2);
        practiceTest.enqueue(3);
        System.out.println(practiceTest.dequeue());
        System.out.println(practiceTest.dequeue());
        System.out.println(practiceTest.dequeue());
        System.out.println(practiceTest.dequeue());

    }
}








