package javaStudyChapter1to2.ch06;

public class Student {

    public int studentNumber;
    public String studentName;
    public int grade;

    public Student(){ // 생성자 이름은 같고 매개변수가 다른것을 생성자 오버로딩
                    // 디폴트 생성자는 생성자가 하나도 없을때 안보이는곳에 자동으로 생성된다.

    }

    public Student(int studentNumber, String studentName, int grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }


    public String showStudentInfo() {

        return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
    }
}
