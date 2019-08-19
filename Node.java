/* A very generic Node for a singly linked list implementation. */

import java.util.*;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
	
		private T contents;
		private Node<T> next = null;
	
		Node(T c) {
			contents = c;
		}
	
		private void setNext(Node n) {
			next = n;
		}
	
		private Node getNext() {
			return next;
		}
		
		private T getContents() {
			return contents;
		}
		
		@Override
		public int compareTo(Node<T> n) {
			return getContents().compareTo(n.getContents());
		}
}
