package net.ant.bookman.dao;

import net.ant.bookman.model.Book;

import java.util.List;

public interface BookDao {
    public void addBook(Book book);
    public void updateBook(Book book);
    public void deleteBook(int id);
    public Book getBookById(int id);
    public List<Book> listBooks();
}
