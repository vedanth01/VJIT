package com.app.mockito;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusiness {
public ToDoService doService;

public ToDoBusiness(ToDoService doService){
	this.doService=doService;
}
public List<String> getTodosforHibernate(String user)
{
	List<String> hibernatelist=new ArrayList<String>();
	List<String> combinedList=doService.getTodos(user);
	for(String todo:combinedList){
		if(todo.contains("Hibernate")){
			hibernatelist.add(todo);
		}
	}
	return hibernatelist;
}
}
