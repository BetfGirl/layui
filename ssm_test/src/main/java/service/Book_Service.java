package service;

import java.util.List;

import model.Book;

public interface Book_Service {
	public List<Book> select(String txt);
	
	public Book selectById(int id);
	
	public void insert(Book t);
	
	public void update(Book t);
	
	public void delete(int id);
}
