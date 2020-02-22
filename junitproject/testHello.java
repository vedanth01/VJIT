package junitproject;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testHello {
@Test
public void testsay()
{
	hello h = new hello();
assertEquals("hello",h.say());	
}
}
