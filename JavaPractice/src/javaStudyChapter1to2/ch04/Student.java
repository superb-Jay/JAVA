package javaStudyChapter1to2.ch04;

public class Student {
    public int studentID;
    public String studentName;
    public String adress;

    public void showWtudentInfo() {
        System.out.println(studentID + "학번 학생의 이름은 "+ studentName+"이고 , 주소는 " + adress +"입니다.");
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
