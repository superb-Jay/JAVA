package javaStudyChapter1to2.ch04;

public class StrudentTest {
    public static void main(String[] args) {

        Student studetLee = new Student();

        studetLee.studentID = 12345;
        studetLee.setStudentName("Lee");
        studetLee.adress = "서울 강남구";

        studetLee.showWtudentInfo();
    }
}
