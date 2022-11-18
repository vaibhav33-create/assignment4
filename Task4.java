package assignment4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<Integer> ele = new ArrayList<Integer>();
		
		ele.add(10);
		ele.add(45);
		ele.add(90);
		ele.add(45);
		ele.add(23);
		ele.add(90);
		ele.add(44);
		
		for(int i=0;i<ele.size();i++) {
		if(ele.get(i)==45) {
			System.out.println(ele.get(i));
		}
		}
		for(int i1=0;i1<ele.size();i1++) {
			if(ele.get(i1)==90) {
				System.out.println(ele.get(i1));
			}
		}
	}	

}
