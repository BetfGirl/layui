package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Book;
import model.Type;
import service.Book_Service;
import service.Type_Service;

@Controller
@RequestMapping("Book")
public class BookController {
	@Autowired
	Book_Service service;
	@Autowired
	Type_Service typeService;
	@ExceptionHandler
	public void ex(Exception e) {
		e.printStackTrace();
	}
	@RequestMapping("index")
	public @ResponseBody List index(String txt,ModelMap m) {
		if(txt!=null) txt=" where book.name like '%"+txt+"%'";
		else txt="";
		return service.select(txt);
	}
	
	@RequestMapping("insert")
	public @ResponseBody String insert(Book b,ModelMap m) {
		 service.insert(b);
		 return "{\"status\":1}";
	}
	@RequestMapping("update")
	public @ResponseBody String  update(Book b,ModelMap m) {
		service.update(b);
		return "{\"status\":1}";
	}
	@RequestMapping("delete")
	public @ResponseBody String  delete(int id,ModelMap m) {
		 service.delete(id);
		 return "{\"status\":1}";
	}
	@RequestMapping("sexs")
	public @ResponseBody String[] sexs() {
		return Book.sexs;
	}
	
	@RequestMapping("type")
	public @ResponseBody List<Type> type() {
		return typeService.select();
	}
}

