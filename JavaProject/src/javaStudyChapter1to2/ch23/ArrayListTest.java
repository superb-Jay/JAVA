package javaStudyChapter1to2.ch23;
import javaStudyChapter1to2.ch21.Book;
import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<Book>();
        library.add(new Book("태백산맥1","조정래"));
        library.add(new Book("태백산맥2","조정래"));
        library.add(new Book("태백산맥3","조정래"));
        library.add(new Book("태백산맥4","조정래"));
        library.add(new Book("태백산맥5","조정래"));

        for (int i = 0; i < library.size() ; i++) { // 어레이 리스트는 length가 아니라 size 요소의개수를 사용
            library.get(i).showInfo();
        }
    }
}
