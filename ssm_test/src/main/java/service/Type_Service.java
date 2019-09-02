package service;

import java.util.List;


import model.Type;

public interface Type_Service {
	
	public List<Type> select();
	
	public Type selectById(int id);
	
	public void insert(Type t);
	
	public void update(Type t);
	
	public void delete(int id);
}
