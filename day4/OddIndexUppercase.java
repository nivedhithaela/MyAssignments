package week2.day2;

import java.util.Arrays;

public class OddIndexUppercase {

	public static void main(String[] args) {
		String test="ChaNgeme";
		String test1=test.toLowerCase();
		System.out.println(test1);
		char a[]=test1.toCharArray();
		System.out.println(Arrays.toString(a));
		   for(int i=0; i<a.length; i++){
			   if(i%2!=0)
	        a[i]=Character.toUpperCase(a[i]);
	      }
	      System.out.println(a);
			
		}
		
		}




