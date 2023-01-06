package javaStudyChapter1to2.ch24;

import java.util.ArrayList;

public class Student {

    private int studentId;
    private String studentName;
    private ArrayList<Subject> subjectList;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        subjectList = new ArrayList<>();
    }

    public void addSubject(String subjectName, int score) {
        Subject subject = new Subject();
        subject.setScore(score);
        subject.setSubjectName(subjectName);
        subjectList.add(subject);

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        studentName = studentName;
    }

    public void showStudentInfo() {
        int total=0;

//        for (int i = 0; i < subjectList.size(); i++) {
//            total += subjectList.get(i).getScore();
//            System.out.println("학생 " + studentName + "의 " + subjectList.get(i).getSubjectName() +  "과목 성적은 "
//            + subjectList.get(i).getScore() +"점 입니다.");
//        }
        for (Subject subject : subjectList) { // 향상 포문
            total += subject.getScore();;
            System.out.println("학생 " + studentName + "의 " + subject.getSubjectName() +  "과목 성적은 "
            + subject.getScore() +"점 입니다.");
        }



        System.out.println("학생 " + studentName + "의 총점은 " + total + "점 입니다." );
    }
}
