package me.day04.practice;
import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        boolean run = true;
        int menuNum = 0;
        int seedMoney;

        final int KIMBAB = 2500;
        final int RAMEN = 3000;
        final int DDUKBBOKI = 4000;
        final int DONGATSU = 5000;

        System.out.println("김밥 천국 키오스크 입니다.");
        System.out.println("가지고있는 돈을 입력하세요 (숫자만 입력하세요)");

        while(!in.hasNextInt()) {
            in.next();
            System.out.println("정확한 금액을 숫자만 입력해주세요.");
        }
        seedMoney = in.nextInt();

        if(seedMoney > 2000) {

            while (run) {

                System.out.println("==================");
                System.out.println("메뉴를 선택해주세요.");
                System.out.println("1. 김밥 - 2000원 ");
                System.out.println("2. 라면  - 3000원 ");
                System.out.println("3. 떡볶이 - 4000원");
                System.out.println("4. 돈까스 - 5000원");
                System.out.println("5. 프로그램 종료.");
                System.out.println("==================");
                System.out.println("메뉴번호입력>");


                while(!in.hasNextInt()) {
                    in.next();
                    System.out.println("메뉴선택 오류 1~5번 사이의 메뉴를 선택해주세요.");
                }
                menuNum = in.nextInt();

                if (menuNum > 0 && menuNum < 5) {
                    
                    switch(menuNum) {
                        
                        case 1 :
                            if(seedMoney >= KIMBAB) {
                                System.out.println("김밥을 선택하셨습니다.");
                                System.out.println("잔돈은 " + (seedMoney - KIMBAB) + "원 입니다.");
                                System.out.println("식사 주문이 완료 되었습니다.");
                                System.out.println("프로그램을 종료 합니다.");
                                return;

                            }else{
                                System.out.println("금액이 부족합니다 다른 메뉴를 선택해주세요.");
                                continue;
                            }
                        case 2 :
                            if(seedMoney >= RAMEN) {
                                System.out.println("라면을 선택하셨습니다.");
                                System.out.println("잔돈은 " + (seedMoney - RAMEN) + "원 입니다.");
                                System.out.println("식사 주문이 완료 되었습니다.");
                                System.out.println("프로그램을 종료 합니다.");
                                return;
                            }else{
                                System.out.println("금액이 부족합니다 다른 메뉴를 선택해주세요.");
                                continue;
                            }
                        case 3 :
                            if(seedMoney >= DDUKBBOKI) {
                                System.out.println("떡복기를 선택하셨습니다.");
                                System.out.println("잔돈은 " + (seedMoney - DDUKBBOKI) + "원 입니다.");
                                System.out.println("식사 주문이 완료 되었습니다.");
                                System.out.println("프로그램을 종료 합니다.");
                                return;
                            }else{
                                System.out.println("금액이 부족합니다 다른 메뉴를 선택해주세요.");
                                continue;
                            }
                        case 4 :
                            if(seedMoney >= DONGATSU) {
                                System.out.println("돈까스 선택하셨습니다.");
                                System.out.println("잔돈은 " + (seedMoney - DONGATSU) + "원 입니다.");
                                System.out.println("식사 주문이 완료 되었습니다.");
                                System.out.println("프로그램을 종료 합니다.");
                                return;
                            }else{
                                System.out.println("금액이 부족합니다 다른 메뉴를 선택해주세요.");

                            }
                    }


                } else {
                    System.out.println("프로그램을 종료합니다.");
                    return;

                }

            }
        }
        System.out.println("돈이 부족하여 김밥천국 입장 불가능 합니다.");




    }
}


