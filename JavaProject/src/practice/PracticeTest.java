package practice;

import java.util.ArrayList;

public class PracticeTest<T> {

    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if(stack.isEmpty()) {
            return null;
        }
        stack.get(stack.size()-1);
        return stack.remove(stack.size()-1);
    }
    public static void main(String[] args) {

        PracticeTest<Integer> practiceTest = new PracticeTest();

        practiceTest.push(1);
        practiceTest.push(2);
        practiceTest.push(3);
        System.out.println(practiceTest.pop());
        System.out.println(practiceTest.pop());
        System.out.println(practiceTest.pop());
        System.out.println(practiceTest.pop());

    }
}








