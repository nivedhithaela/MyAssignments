package week2.day2;

import java.util.Arrays;

public class ReverseStrings {

	public static void main(String[] args) {
		String test="I am a software tester";
		String rev="";
		String s[]=test.split(" ");
		System.out.println(Arrays.toString(s));
		for(int i=0;i<s.length;i++) {
			if(i%2!=0) {
				char a[]=s[i].toCharArray();
				for(int j=a.length-1;j>=0;j--) {
					rev=rev+a[j];
				}
				System.out.print(rev+" ");
			
			}
			else {
				System.out.print(s[i]+" ");
			}
		}
	}
}
					
		
				
		
				
				
			
		

	



