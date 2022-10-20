package practice;

public class PracticeTest {
       public static void main(String[] args) {

                   String str = "Java is Fun.";
                   String substring1 = str.substring(1, 5); // 문자열을 각 문자로 쪼개어 인덱스를 부여하고 0번째부터 4번째전까지 출력 즉 4글자 출력
                   String substring2 = str.substring(5); // 시작인덱스를 지정하면 지정한 인덱스 다음의 문자부터 출력을 할수 있음.
                   String substring3 = str.substring(5, str.length()); // str.length() 생략가능

                   System.out.println("substring1 = " + substring1);
                   System.out.println("substring2 = " + substring2);
                   System.out.println("substring3 = " + substring3);

                   String substring4 = subString(str, 0, 4);
                   String substring5 = subString(str, 5);
                   String substring6 = subString(str, 5, str.length()); // str.length() 생략가능

                   System.out.println("substring1 = " + substring4);
                   System.out.println("substring2 = " + substring5);
                   System.out.println("substring3 = " + substring6);
               }

               // 객체지향적인 코드는 아님
               // 객체지향적인 코드는 문자열.substring(...) // 문자열 will be substituted from ... to ...;
               // 해당 코드 호출은 subString(문자열, ...) // substitute 문자열 from ... to ...;
               public static String subString(String s, int beginIndex, int endIndex) {
                   String result = "";
                   for(int i = beginIndex; i < endIndex; i++) {
                       result += s.charAt(i);
                   }
                   return result;
               }

               public static String subString(String s, int beginIndex) {
                   String result = "";
                   for(int i = beginIndex; i < s.length(); i++) {
                       result += s.charAt(i);
                   }
                   return result;
               }
           }





