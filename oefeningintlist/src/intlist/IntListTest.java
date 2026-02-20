package intlist;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class IntListTest {

	@Test
	void test() {
		int[] argument = {1,2,3,4};
		IntList myarray = new IntList();
		assertEquals(4,myarray.getLength());
		assertEquals(2,myarray.getElementIndex(1));
		int[] gewijzigde_argument = {1,2,3,4,5};
		assertArrayEquals(gewijzigde_argument,myarray.addLast(5));
		int[] gewijzigde_argument_2 = {1,2,3};
		assertArrayEquals(gewijzigde_argument_2,myarray.removeLast());
	}
}