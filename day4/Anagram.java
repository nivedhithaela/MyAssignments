package week2.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="listen";
		String text2="silent";
		int t1=text1.length();
		int t2=text2.length();
		if(t1==t2) {
			char a[]=text1.toCharArray();
			char b[]=text2.toCharArray();
			System.out.println("Before Sorting");
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
			Arrays.sort(a);
			Arrays.sort(b);
			System.out.println("After Sorting");
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
			boolean status=Arrays.equals(a, b);
			if(status==true) {
				System.out.println("The given strings are Anagram");
			}
			else {
				System.out.println("The given strings are not an Anagram");
			}
			}
			else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
	}

}
