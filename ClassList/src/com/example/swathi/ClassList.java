/* Name - Swathi Reddy Konatham (Z1864290)
 * Activity - Activity 0
 * Description - Example class to iterate over a HashMap
 * */

package com.example.swathi;

import java.util.*;
import java.util.Map.Entry;

public class ClassList {
	
	Map<String,String> classList = new HashMap<String,String>();
	
	public ClassList() {
		classList.put("Bob", "A");
		classList.put("Mary", "C");
		classList.put("Sarah", "B");
		classList.put("Philip", "A");
		classList.put("Greg", "F");
		
	}
	
	public void printClassList() {
		Iterator<Entry<String,String>> entries = classList.entrySet().iterator();
		while(entries.hasNext()) {
			Entry<String,String> entry = entries.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());			
		}
		
	}
	
	public void printClassList2() {
		for(Map.Entry<String,String> entry : classList.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		
		//iterating over keys only
		for(String key : classList.keySet()) {
			System.out.println("Key = " + key);
		}
		
		//iterating over values only
		for(String value : classList.values()) {
			System.out.println("Value = " + value);
		}
	}
	

	public static void main(String[] args) {
		ClassList myClassList = new ClassList();
		myClassList.printClassList();
		myClassList.printClassList2();

	}

}
