package me.day14.practice.practice03;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static List<Student> studentList = new ArrayList<>(); // 수정
    public static void main(String[] args) {
        studentList.add(new Student("20212222", "이순신", 85));  // 입학연도: 2021 + 들어간 순서: 1
        studentList.add(new Student("20211111", "자바킹", 100)); // 입학연도: 2021 + 들어간 순서: 2
        studentList.add(new Student("20213333", "이제이", 50));  // 입학연도: 2021 + 들어간 순서: 3
        studentList.add(new Student("20171234", "이텔리", 80));  // 입학연도: 2017 + 들어간 순서: 4
        studentList.add(new Student("20045555", "이초잉", 70));  // 입학연도: 2004 + 들어간 순서: 5

        System.out.println("====================== 실습 1번 ======================");
        List<Student> result = upper(50);
        for(Student student : result){
            System.out.println(student);
        }
        System.out.println("====================== 실습 2번 ======================");
        List<Student> result2 = lower(99);
        for(Student student : result2){
            System.out.println(student);
        }
        System.out.println("====================== 실습 3번 ======================");
        System.out.println("학생 평균: " + average());
    }
    public static List<Student> upper(int score) { // TODO: 실습 3번 구현
        List<Student> upperAscendingSort = new ArrayList<Student>();
        for (Student student : studentList) {
            if (student.getScore() > score) {
                upperAscendingSort.add(student);
            }
        }
        Collections.sort(upperAscendingSort);
        return upperAscendingSort;
    }
    public static List<Student> lower(int score) {// TODO: 실습 3번 구현
        List<Student> lowerDescendingSort = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getScore() < score) {
                lowerDescendingSort.add(student);
            }
        }
        lowerDescendingSort.sort(Collections.reverseOrder());
        return lowerDescendingSort;
    }
    public static double average() {// TODO: 실습 3번 구현
        double average = 0.0;
        for (Student student : studentList) {
            average += student.getScore();
        }
        return average / studentList.size();
    }
}