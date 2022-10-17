package ch24;

import java.util.ArrayList;

public class Student   {

    private String studentName;
    private int studentId;
    ArrayList<Subject> subjectList;

    public Student(int studentId,String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String subjectName, int score) {
        Subject subject = new Subject();
        subject.setSubjectName(subjectName);
        subject.setSubjectScore(score);
        subjectList.add(subject);
    }

    public void showStudentInfo() {

        int total = 0;

        for (Subject subject : subjectList) {
            total += subject.getSubjectScore();
            System.out.println("학생" + studentName + "의 " + subject.getSubjectName() +" 과목의 성적은"+ subject.getSubjectScore()
            +" 점 입니다.");
        }
        System.out.println("학생" + studentName + "의 총점은? "+total+ "입니다." );
    }
}
