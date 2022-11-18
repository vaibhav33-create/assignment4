package assignment4;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {

List<String> ele = new ArrayList<String>();
		
		ele.add("Git");
		ele.add("Github");
		ele.add("GitLab");
		ele.add("GitBash");
		ele.add("Selenium");
		ele.add("Java");
		ele.add("Maven");
		
		
		for(String el : ele) {
			if(el.contains("Git")) {
				System.out.println(el);
			}
		}
	}

}
