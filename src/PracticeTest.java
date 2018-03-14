import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class PracticeTest {

	//If the first argument is greater than the second
	@Test
	void compareTest() {
		assertEquals(Practice.compare(10, 12), false);
		assertEquals(Practice.compare(9, -1), true);
	}
	
	//Method returns true if    first - second = odd number 
	@Test
	void oddTest() {
		assertTrue(Practice.odd(10, 7));
		assertFalse(Practice.odd(21, 7));
		assertTrue(Practice.odd(1, -1));
	}
	
	//Method returns String representation of Sum of two values 
	@Test
	void sumTest() {
		assertEquals("17",Practice.sum(10, 7));
		assertEquals("28",Practice.sum(21, 7));
		assertEquals("0", Practice.sum(1, -1));
	}
	
	//Method returns highest value from array 
	@Test
	void highestTest() {
		assertEquals("895",Practice.highest(new int[] {1,3,7,9,234,895,2}));
		assertEquals("-1",Practice.highest(new int[] {-1,-3,-7,-9,-234,-895,-2}));
		assertEquals("0",Practice.highest(new int[] {0,0,0,0,0}));
		assertEquals("0",Practice.highest(new int[] {}));
	}	
	
	//Method returns revert array, example: inputArr[1,2,3,4], outPutArr[4,3,2,1] 
	@Test
	void revertTest() {
		assertTrue(Arrays.equals(Practice.revert(new int[] {1,3,7,9,234,895,2}), new int[] {2,895,234,9,7,3,1}));
		assertTrue(Arrays.equals(Practice.revert(new int[] {-1,-3,-7,-9,-234,-895,-2}), new int[] {-2,-895,-234,-9,-7,-3,-1}));
		assertTrue(Arrays.equals(Practice.revert(new int[] {}), new int[] {}));
	}	

	//Method returns array, excluding value, which can be divided by the divider 
	//example: inputArr[1,2,3,4], divider = 2 -> outPutArr[1,3] 
	//example: inputArr[1,2,3,4], divider = 3 -> outPutArr[1,2,4] 
	@Test
	void removeTest() {
		assertTrue(Arrays.equals(Practice.remove(new int[] {1,2,3,4,5,6,7,8,9,10},2)
				, new int[] {1,3,5,7,9}));
		assertTrue(Arrays.equals(Practice.remove(new int[] {1,2,3,4,5,6,7,8,9,10},3)
				, new int[] {1,2,4,5,7,8,10}));
		assertTrue(Arrays.equals(Practice.remove(new int[] {1,2,3,4,5,6,7,8,9,10},0)
				, new int[] {1,2,3,4,5,6,7,8,9,10}));
		assertTrue(Arrays.equals(Practice.remove(new int[] {1,2,3,4,5,6,7,8,9,10},1)
				, new int[] {}));
	}	
	
	

}
