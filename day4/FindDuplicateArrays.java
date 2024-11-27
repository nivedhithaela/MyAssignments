package week2.day2;

import java.util.Arrays;

public class FindDuplicateArrays {

	public static void main(String[] args) {
		int num[]= {2,5,7,7,5,9,2,3};
		System.out.println(num);
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println("Duplicate values:");
		for(int i=0;i<num.length-1;i++) {
				if(num[i]==num[i+1]) {
					System.out.println(num[i]);
				
				}
				}
			}
		}

	


