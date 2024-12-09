package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListLargest {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		a.add(3);
		a.add(2);
		a.add(11);
		a.add(4);
		a.add(6);
		a.add(7);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		int num= a.get(4);
		System.out.println(num);
		
	}

}
