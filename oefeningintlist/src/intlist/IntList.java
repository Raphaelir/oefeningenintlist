package intlist;

import java.util.stream.IntStream;

/**
 * Elke instantie van deze klasse slaat een reeks getallen op
 */
public class IntList {
	Integer value;
	IntList next;
	
	private IntList getNext() {
		return this.next;
	}
	/**
	 * @post | getLength() == 0
	 * 
	 */
	public IntList() {
		this.value = null;
		this.next = null;
	}
	/**
	 * @post | result == getArray().length
	 */
	
	public int getLength() {
		IntList beschouw = this;
		int teller = 0;
		while(beschouw.value != null) {
			teller++;
			beschouw = beschouw.getNext();
		}
		return teller;
	}
	
	/**
	 * @pre | 0 <= index && index < getLength()
	 * @post | result == getArray()[index]
	 */
	public int getElementIndex(int index) {
		IntList beschouw = this;
		int teller = 0;
		while(teller < index) {
			teller++;
			beschouw = beschouw.getNext();
		}
		return beschouw.value;
	}
	/**
	 * @creates | result
	 * @post | result != null
	 */
	public int[] getArray() {
		int lengte = this.getLength();
		int index = 0;
		IntList beschouw = this;
		int[] lijst = new int[lengte];
		while(beschouw.value!=null) {
			lijst[index] = beschouw.value;
			beschouw = beschouw.getNext();
			index++;
		}
		return lijst;
	}
	/**
	 * @pre element != null
	 * @mutates | this
	 * @post | IntStream.range(0,old(getArray()).clone().length).allMatch(i->getArray()[i]==old(getArray()).clone()[i]) && getArray()[getArray().length-1] == element
	 */
	public void addLast(int element) {
		IntList beschouw = this;
		while(beschouw.value != null) {
			beschouw = beschouw.getNext();
		}
		beschouw.value = element;
		IntList volgende = new IntList();
		beschouw.next = volgende;
		
	}
	/**
	 * @pre | getLength()>0
	 * @mutates | this
	 * @post | getLength() == old(getLength())-1
	 * @post | IntStream.range(0,old(getArray()).clone().length-1).allMatch(i->getArray()[i]==old(getArray().clone())[i])
	 * 
	 */
	public void removeLast() {
		IntList beschouw = this;
		while(beschouw.getNext().value != null) {
			beschouw = beschouw.next;
	}
		beschouw.value = null;
		beschouw.next = null;
	}
}
