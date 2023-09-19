package com.systechafrica.part2.interfaces;

public class BookMS {
  public static void main(String[] args) {
    BookController bookController = new BookControllerImp();
    Book book1 = new Book("101", "Java Programming", "Emmanuel");
    Book book2 = new Book("102", "Python Programming", "Mwiti");
    Book book3 = new Book("103", "Block chain management", "John");

    Book createdBook1 = bookController.createBook(book1);
    Book createdBook2 = bookController.createBook(book2);
    Book createdBook3 = bookController.createBook(book3);
    // System.out.println("Created books" + createdBook1 + "\n" + createdBook2 +
    // "\n" + createdBook3 + "\n");
    bookController.deleteBook(book2);
    Book findBook = bookController.findBook("102");
    // System.out.println("Found book with isbn 101" + findBook);
    Book updatedBook = bookController.updateBook("101", "updated book");
    Book finBook2 = bookController.findBook("101");
    System.out.println(finBook2);

  }
}
