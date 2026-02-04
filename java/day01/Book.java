class Book {
    String title;
    String author;
    int yearPublished;

    Book(String t, String a, int y) {
        title = t;
        author = a;
        yearPublished = y;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println();
    }
}

class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling", 1995);
        Book book2 = new Book("Clean Code", "Robert C. Martin", 2008);

        book1.displayInfo();
        book2.displayInfo();
    }
}
