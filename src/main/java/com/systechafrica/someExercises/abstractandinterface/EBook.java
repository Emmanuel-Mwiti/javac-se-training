package com.systechafrica.someExercises.abstractandinterface;

// import com.systechafrica.part2.accessmodifiers.lms.Book;

interface Readable {
  // !All methods inside an interface are by default abstract, therefore there
  // ! should be no concrete implementation

  public void readBook();

  public void setBookMark();

}

abstract class Book implements Readable {
  public void readBook() {
  }

  abstract public void readingAgain();
}

class EBook extends Book {
  public void readBook() {
  }

  public void setBookMark() {
  }

  public void readingAgain() {

  }
  // abstract public void goingOut(); //!You cannot define an abstract method
  // !inside a non-abstract class

}
