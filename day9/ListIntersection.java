package week3.day3;

import java.util.ArrayList;
import java.util.List;

public class ListIntersection {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		//adding list1 elements
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		System.out.println("list1 is:"+list1);
		int lists1 = list1.size();
		System.out.println("size of list1 is:"+lists1);
		//adding list2 elements
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
		System.out.println("list2 is:"+list2);
		int lists2 = list2.size();
		System.out.println("size of list2 is:"+lists2);
		System.out.println("Intersected elements are:");
		for(int i=0;i<lists1;i++) {
			for(int j=0;j<lists2;j++) {
				if(list1.get(i)==list2.get(j))
					System.out.println(list1.get(i));
			}
		}
		
		
		}
		

	}


