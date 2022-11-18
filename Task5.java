package assignment4;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(11);
		l1.add(22);
		l1.add(33);
		List<Integer> l2 = new ArrayList<Integer>();
		
		l2.add(9);
		l2.add(19);
		l2.add(29);
		
		l2.addAll(l1);
		
		System.out.println(l2);
		
		List<Integer> l3 = new ArrayList<Integer>();
		
		l3.add(7);
		l3.add(17);
		l3.add(27);
		
		l3.addAll(l2);
		
		System.out.println(l3);
	}

}
