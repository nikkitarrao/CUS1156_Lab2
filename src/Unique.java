/* Project: Lab 2: Git
* Class: Unique.java
* Author: Nikkita Tarrao
* Date: February 23, 2024
* This program counts and returns the number of distinct elements in an ArrayList of strings without modifying the list
*/


import java.util.*;

public class Unique {

	public static int countUnique(ArrayList <String> list) {
		int count = 0;
		for(int i = 0; i < list.size(); i++) {
			boolean uniqueWord = true;
			for(int j = i+1; j < list.size(); j++) {
				if(list.get(i).equals(list.get(j))) {
					uniqueWord = false;
					break;
				}
			}
			if (uniqueWord) {
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList <String>();
		list.add("hi");
		list.add("bye");
		list.add("wowowowow");
		list.add("ok");
		list.add("bye");
		list.add("hi");
		list.add("lol");
		list.add("hi");
		System.out.print("number of unique words in list: " + countUnique(list));
		

	}

}
