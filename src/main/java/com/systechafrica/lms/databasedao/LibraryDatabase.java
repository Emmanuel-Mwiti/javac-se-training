package com.systechafrica.lms.databasedao;

import java.util.List;

import com.systechafrica.lms.models.Student;
import com.systechafrica.lms.models.Book;

public interface LibraryDatabase {
  boolean borrowBook(Student student, Book book);

  boolean returnBook(Student student, Book book);

  List<Book> getBorrowedBooks();
}
