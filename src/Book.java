public class Book {
    // OOP
    // class: collection of state and behavior that completely describes something
    // state: fields
    // behavior: methods

    // object: an instance of a class

    // Book describes a book in real life

    // fields
    private String title;
    private String author;
    private int numPages;

    // constructors
    // for free, we get a default vale constructor (DVC)

    // once we define a constructor, we lose our free DVC
    // explict value constructor (EVC)
    public Book(String title, String paramAuthor, int paramNumPages) {
        // title, author, and numPages are fields of the new object being created
        // this object is referenced using this
        this.title = title; // shadowing, title parameter shadows title the field
        author = paramAuthor;
        numPages = paramNumPages;
    }

    public Book() {
        title = "Blank Title";
        author = "Blank Author";
        numPages = -1;
    }

    // toString()
    // every class either directly or indirectly inherits from Object
    // we can override toSting() and any other method inherited from Object

    // ANNOTATIONS
    // metadata or metainformation about your code used by the compiler and the IDEA
    // @Override @SuppressWarnings
    @Override
    public String toString() {
        // returns a string representation of the invoking object (this)
        String bookStr = "";
        bookStr += title + " by " + author;
        return bookStr;
    }

    // recall access modifiers
    // 1. public - accessible anywhere
    // 2. package-private - accessible anywhere in this package
    // 3. protected - package-private plus accessible from any subclass, even outside the package
    // 4. private - accessible only in this class

    // getters and setters
    public String getTitle() {
        return title;
    }

    // task 1. add a getter for author and numPages
    public String getAuthor() {
        return author;
    }
    public int getNumPages() {
        return numPages;
    }

}
