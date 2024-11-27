package week2.day2;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text="We learn Java basics as part of java sessions in java week1";
		int count=0;
		String output="";
		System.out.println(text);
		String s[]=text.split(" ");
		System.out.println(Arrays.toString(s));
		for(int i=0;i<s.length;i++){
			for(int j=i+1;j<s.length-1;j++)
				{
				if(s[i].equalsIgnoreCase(s[j])) {
					count++;
					s[j]=" ";
				}
				}
			output=output+" "+s[i] ;
			
			}
		System.out.println(output);
		System.out.println(count);
		
		

	}

}
