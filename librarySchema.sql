-- Library Management System

CREATE TABLE IF NOT EXISTS `students_books` (" + "`student_number` VARCHAR(255) NOT NULL," +"`isbn` VARCHAR(255) PRIMARY KEY," +"`title` VARCHAR(255)" +");
CREATE TABLE IF NOT EXISTS `books` (" +"`isbn` VARCHAR(255) PRIMARY KEY," +"`title` VARCHAR(255) NOT NULL" +");

-- inserting into the both tables
INSERT INTO students_books (student_number, isbn, title) VALUES (?, ?, ?);
INSERT INTO books (isbn, title) VALUES (?, ?);

SELECT * FROM books
