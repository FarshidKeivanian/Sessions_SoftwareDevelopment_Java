class Book {
    String title;
    String author;

    void readBook() {
        System.out.println("Reading " + title + " by " + author);
    }

    public static void main(String[] args) {
        // Creating an instance of the Book class
        Book myBook = new Book();
        myBook.title = "Java Programming";
        myBook.author = "James Gosling";

        // Calling the method to display output
        myBook.readBook();
    }
}
