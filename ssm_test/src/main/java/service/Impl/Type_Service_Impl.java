package service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Type_Dao;
import model.Type;
import service.Type_Service;

@Service
public class Type_Service_Impl implements Type_Service{
	@Autowired
	Type_Dao dao;
	public List<Type> select() {
		// TODO Auto-generated method stub
		return dao.select();
	}

	public void insert(Type t) {
		dao.insert(t);
	}

	public void update(Type t) {
		dao.update(t);
		
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public Type selectById(int id) {
		// TODO Auto-generated method stub
		return dao.selectById(id);
	}

}
