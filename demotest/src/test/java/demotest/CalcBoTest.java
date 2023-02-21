package demotest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcBoTest {

	@Test
	public void testPositiveAdd() {
		CalcBo cb = new CalcBo();
		int k = cb.add(10, 20);
		assertEquals(k, 30);
	}

	@Test
	public void testGetAll() {
		CalcBo cb = new CalcBo();
		int k = cb.getAll().size();
		
		assertEquals(k, 2);
	}
}
