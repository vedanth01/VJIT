package mockitopack1;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

import static org.mockito.Mockito.*;
public class TestList {
@Test
public void testList_ReturnsSingle_value(){
	List mocklist=mock(List.class);
	when(mocklist.size()).thenReturn(1);
	assertEquals(1,mocklist.size());
	assertEquals(1,mocklist.size());
	System.out.println(mocklist.size());
	System.out.println(mocklist);
}
@Test
public void testList_Returns_MultipleValues(){
	List mocklist=mock(List.class);
	when(mocklist.size()).thenReturn(1).thenReturn(2).thenReturn(3);
	assertEquals(1,mocklist.size());
	assertEquals(2,mocklist.size());
	assertEquals(3,mocklist.size());
	System.out.println(mocklist.size());
	System.out.println(mocklist);
}
@Test
public void testList_get(){
	List mocklist=mock(List.class);
	when(mocklist.get(0)).thenReturn("mockito");
	assertEquals("mockito",mocklist.get(0));
	System.out.println(mocklist.get(0));
}
}