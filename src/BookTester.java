import java.util.jar.JarOutputStream;

public class BookTester {
    public static void main(String[] args) {
        // BookTester is a tester, AKA driver program

        Book bookOne = new Book("red fish blue fish", "Dr. Seuss", 25);
        Book bookTwo = new Book();
        System.out.println(bookTwo);
        System.out.println(bookTwo.getTitle());

        bookOne.setTitle("one fish two fish red fish blue fish");
        System.out.println(bookOne);
    }
}
