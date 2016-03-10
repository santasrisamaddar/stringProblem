package StringProblem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitTest {
	
	@Test
	public void testStrProblem1(){
		StrProblem obj1 = new StrProblem();
		
		assertEquals(obj1.remCharInStr("This is a Java Programming", 'i'), true);
		
		
		
	}
	
	@Test
	public void testStrProblem2(){
		StrProblem obj1 = new StrProblem();
		
		assertEquals(obj1.remCharInStr("", 'i'), true);
	}
	
	@Test
	public void testStringProblemClass(){
		StringProblemClass obj1 = new StringProblemClass();
		
		assertEquals(obj1.remCharInStr1("This is a java programming.", 'i'), true);
		
	}
	
	@Test
	public void testStringProblemClass1(){
		StringProblemClass obj1 = new StringProblemClass();
		
		assertEquals(obj1.remCharInStr1("This is a java programming.", 'm'), false);
		
	}
}
