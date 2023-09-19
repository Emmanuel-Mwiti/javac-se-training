package com.systechafrica.part2.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookControllerImp implements BookController {
  private List<Book> bookList = new ArrayList<>();

  @Override
  public Book createBook(Book book) {
    book.setId(UUID.randomUUID().toString());
    bookList.add(book);
    return book;
  }

  @Override
  public void deleteBook(Book book) {
    if (book != null) {
      bookList.removeIf(existingBook -> existingBook.getId().equals(book.getId()));
    }

  }

  @Override
  public Book findBook(String isbn) {
    for (Book book : bookList) {
      if (book.getIsbn().equals(isbn)) {
        return book;
      }

    }
    return null;
  }

  @Override
  public Book updateBook(String isbn, String title) {
    Book bookFound = findBook(isbn);
    if (bookFound != null) {
      bookFound.setTitle(title);
    }
    return bookFound;
  }

}
