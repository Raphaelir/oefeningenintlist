package intlist;

import java.util.stream.IntStream;

/**
 * Elke instantie van deze klasse slaat een reeks getallen op
 */
public class IntList {
	private int[] lijst;
	
	/**
	 * @post | getLength() == 0
	 * 
	 */
	public IntList() {
		this.lijst = new int[0];
	}
	/**
	 * @post | result == getArray().length
	 */
	public int getLength() {
		return lijst.length;
	}
	/**
	 * @pre | 0 <= index && index < getLength()
	 * @post | result == getArray()[index]
	 */
	public int getElementIndex(int index) {
		return lijst[index];
	}
	/**
	 * @creates | result
	 * @post | result != null
	 */
	public int[] getArray() {
		return lijst.clone();
	}
	/**
	 * @pre element != null
	 * @mutates | this
	 * @post | IntStream.range(0,old(getArray()).clone().length).allMatch(i->getArray()[i]==old(getArray()).clone()[i]) && getArray()[getArray().length-1] == element
	 */
	public void addLast(int element) {
		int lengte = getArray().length;
		int[] merged = new int[getArray().length+1];
		for(int i = 0;i < lengte;i++) {
			merged[i] = getArray()[i];
		}
		merged[getArray().length] = element;
		this.lijst = merged;
				
	}
	/**
	 * @pre | getLength()>0
	 * @mutates | this
	 * @post | getLength() == old(getLength())-1
	 * @post | IntStream.range(0,old(getArray()).clone().length-1).allMatch(i->getArray()[i]==old(getArray().clone())[i])
	 * 
	 */
	public void removeLast() {
		int lengte = getArray().length -1;
		int[] verkort = new int[lengte];
		for(int i=0;i<lengte;i++) {
			verkort[i] = getArray()[i];
		}
		this.lijst = verkort;
		
	}
}
