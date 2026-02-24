package intlist;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class IntListTest {

	@Test
	void test_basis() {
		IntList object = new IntList();
		assertArrayEquals(new int[] {},object.getArray());
		assertEquals(0,object.getLength());
		object.addLast(1);
		assertEquals(1,object.getLength());
		object.addLast(2);
		assertEquals(2,object.getLength());
		object.removeLast();
		assertEquals(1,object.getLength());
		int[] array = {1};
		assertArrayEquals(array,object.getArray());
		object.addLast(2);
		object.addLast(3);
		assertEquals(3,object.getElementIndex(object.getLength()-1));
		
	}
	@Test
	void test_representation_exposure() {
		IntList myintlist = new IntList();
		myintlist.addLast(10);
		myintlist.addLast(20);
		int[] external = myintlist.getArray();
		external[0] = 999; // sabotage
		int[] array = {10,20};
		assertArrayEquals(array,myintlist.getArray());
		
	}
}