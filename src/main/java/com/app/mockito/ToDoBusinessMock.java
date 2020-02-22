package com.app.mockito;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ToDoBusinessMock {
@Test
public void testusing_Mocks(){
	ToDoService doService=mock(ToDoService.class);
	List<String> combinedList=Arrays.asList("dtykdkt","ddyddk","Hibernate");
	when(doService.getTodos("dummy")).thenReturn(combinedList);
	ToDoBusiness business=new ToDoBusiness(doService);
	List<String> alltd=business.getTodosforHibernate("dummy");
	System.out.println(alltd);
	assertEquals(1,alltd.size());
}
}
