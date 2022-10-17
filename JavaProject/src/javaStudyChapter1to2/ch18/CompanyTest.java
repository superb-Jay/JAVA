package javaStudyChapter1to2.ch18;

import java.util.Calendar; // 싱글톤 패턴 하나의 인스턴스만 제공해야 할때

public class CompanyTest {

    public static void main(String[] args) {

        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);

        Calendar calendar = Calendar.getInstance();

    }
}
