class Book {
    private String title;
    private String author;
    private int pageCount; // New attribute

    // Constructor to initialize attributes
    Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    // Getter methods
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPageCount() { return pageCount; }

    // Setter methods
    public void setPageCount(int pageCount) { this.pageCount = pageCount; }

    // Method to display book details
    void readBook() {
        System.out.println("Reading \"" + title + "\" by " + author);
    }

    // Method to check if the book is long
    void checkBookLength() {
        if (pageCount > 300) {
            System.out.println("This is a long book.");
        } else {
            System.out.println("This is a short book.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an object of Book with the new constructor
        Book myBook = new Book("Java Programming", "James Gosling", 450);

        // Displaying book details
        myBook.readBook();

        // Checking book length
        myBook.checkBookLength();
    }
}
