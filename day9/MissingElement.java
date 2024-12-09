package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		//add elements
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(10);
		a.add(6);
		a.add(8);
		//a.add(12);
		System.out.println("Before Sorting:"+a);
		//sort
		Collections.sort(a);
		System.out.println("After Sorting:"+a);
		//size
		int asize=a.size();
		System.out.println("size is:"+asize);
		for(int i=0;i<asize-1;i++)
			if(a.get(i)+1!=a.get(i+1)) {
				//11!=
				System.out.println(a.get(i)+1);
			}
		
		

	}

}
