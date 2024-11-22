package labsolutions.lab19;

import java.util.Iterator;

public class MyLinkedList<E> implements Iterable<E>{
	
	//ListNode is private because there's no reason for anything outside the list to handle it
	private class ListNode {

		private E data;
		private ListNode next;
		
		public ListNode(E data, ListNode next) {
			this.data = data;
			this.next = next;
		}
		
		public void setData(E data) {
			this.data = data;
		}
		
		public E getData() {
			return data;
		}
		
		public void setNext(ListNode next) {
			this.next = next;
		}
		
		public ListNode getNext(){
			return next;
		}
		
	}

	private ListNode head = new ListNode(null, null); //dummy node
	private int size;

	public int size() {
		return size;
	}

	public E get(int index) {
		ListNode current = head;
		for(int i = 0; i <= index; i++) {
			current = current.getNext();
		}
		return current.getData();
	}

	public void add(int index, E data) {
		ListNode current = head;
		for(int i = 0; i < index; i++) {
			current = current.getNext();
		}
		ListNode node = new ListNode(data, current.getNext());
		current.setNext(node);
		size++;
	}

	public void set(int index, E newData) {
		ListNode current = head;
		for(int i = 0; i <= index; i++) {
			current = current.getNext();
		}
		current.setData(newData);
	}

	public void remove(int index) {
		ListNode current = head;
		for(int i = 0; i < index; i++) {
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		size--;
	}
	
	public void add(E element) {
		add(size, element);
	}
	
	public int indexOf(E element) {
		ListNode current = head;
		for(int i = 0; i < size; i++) {
			current = current.getNext();
			if(current.getData().equals(element)) {
				return i;
			}
		}
		return -1;
	}
	
	public E getRandomElement() {
		int index = (int)(Math.random() * size);
		return get(index);
	}

	public String toString() {
		ListNode current = head.getNext();
		String out = "[";
		while(current != null) {
			out += current.getData();
			if(current.getNext() != null) {
				out += ", ";
			}
			current = current.getNext();
		}
		out += "]";
		return out;
	}

	//method from Iterable interface makes for-each loops work
	@Override
	public Iterator<E> iterator() {
		return new ListIterator(head);
	}
	
	private class ListIterator implements Iterator<E> {
		
		ListNode current;
		
		public ListIterator(ListNode head) {
			current = head;
		}

		@Override
		public boolean hasNext() {
			return current.getNext() != null;
		}

		@Override
		public E next() {
			current = current.getNext();
			return current.getData();
		}

	}

}