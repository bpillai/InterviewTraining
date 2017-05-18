package com.interview.questions;
import java.util.Hashtable;
import java.util.LinkedList;
 
public class RemoveDuplicated {
 
	/*
	 * use hashtable
	 */
	void delete_duplicated1(LinkedList list) {
		Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
		for (int i = 0; i < list.size(); i++) {
			if (table.containsKey(list.get(i))) {
				list.remove(i);
				i--;
			} else {
				table.put((Integer) list.get(i), true);
			}
		}
	}
 
	/*
	 * use two pointers
	 */
	void delete_duplicated2(LinkedList list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;
				}
			}
		}
	}
 
	static public void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(3);
		list.addLast(3);
		list.addLast(4);
		list.addLast(4);
		list.addLast(5);
		list.addLast(6);
		list.addLast(6);
		System.out.println("The original list:");
		RemoveDuplicated task = new RemoveDuplicated();
		
		System.out.println(list);
		//task.delete_duplicated1(list);
		task.delete_duplicated1(list);
		System.out.println("After removing the duplicated item:");
		System.out.println(list);
	}
}