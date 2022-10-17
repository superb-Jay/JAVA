package javaStudyChapter1to2.ch21;

public class ObjectCopyTest {
    public static void main(String[] args) {

        Book[] libaray = new Book[5];
        Book[] copyLibrary = new Book[5];


        libaray[0] = new Book("태백산맥1", "조정래");
        libaray[1] = new Book("태백산맥2", "조정래");
        libaray[2] = new Book("태백산맥3", "조정래");
        libaray[3] = new Book("태백산맥4", "조정래");
        libaray[4] = new Book("태백산맥5", "조정래");

//        System.arraycopy(libaray, 0, copyLibrary, 0, 5); //얕은 복사 주소값은 같다.

        copyLibrary[0] = new Book(); // 깊은복사 아예 새로만듬.
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for (int i = 0; i < copyLibrary.length; i++) {
            copyLibrary[i].setAuthor(libaray[i].getAuthor());
            copyLibrary[i].setTitle(libaray[i].getTitle());
        }



        libaray[0].setAuthor("박완서");
        libaray[0].setTitle("나목");

        System.out.println("== library ==");
        for (Book book : libaray) {
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("== copylibrary ==");
        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }

    }
}
