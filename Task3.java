package assignment4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {

	public static void main(String[] args) {

List<String> ele = new ArrayList<String>();
		
		ele.add("Java");
		ele.add("TestNG");
		ele.add("Maven");
		ele.add("Java");
		
		Set<String> st = new HashSet<String>(ele);
		System.out.println(st);
	}

}
