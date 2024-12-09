package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		List<String> comp=new ArrayList<String>();
		//adding elements
		comp.add("HCL");
		comp.add("Wipro");
		comp.add("AspireSystems");
		comp.add("CTS");
		System.out.println("Before Sort"+comp);
		//size
		int comp_size=comp.size();
		System.out.println("size is:"+comp_size);
		//sort
		Collections.sort(comp);
		System.out.println("After Sort"+comp);
		String rev=" ";
		System.out.println("Reverse Order is:");
		for(int i=comp_size-1;i>=0;i--) {
			rev=rev+" "+comp.get(i);
			
		}
		System.out.println(rev);
		
		

	}

}
