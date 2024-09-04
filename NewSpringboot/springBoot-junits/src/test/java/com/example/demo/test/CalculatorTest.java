package com.example.demo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.example.demo.Calculator;

public class CalculatorTest {
	
	@Test
	public void test_add() {
		Calculator cal = new Calculator(); 
		Integer actualResult =cal.add(10, 20);
		Integer exceptedResult =30;
		
		assertEquals(exceptedResult,actualResult);
		
		}
	@Test
	public void test_multiply() {
		Calculator cal = new Calculator(); 
		Integer actualResult =cal.multiply(2, 3);
		Integer exceptedResult =6;
		
		assertEquals(exceptedResult,actualResult);
		
		}
	@Test
	public void testPositiveMessage() {
		Calculator cal = new Calculator(); 
		//String str=cal.message();
		assertEquals("Hello world",cal.message() );
		}
	
	@Test
	public void testNotNulleMessage() {
		Calculator cal = new Calculator(); 
		String str=cal.message();
		//assertNotEquals("Hello world1",str );
		assertNotNull(str);
		}
	  
	
}
