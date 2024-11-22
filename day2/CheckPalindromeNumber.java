package week1.day2;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		int num=8585858;
		int org_num=num;
		int rev=0;
		System.out.println("Number is:"+num);
		for(rev=0;num!=0;num=num/10) {
			rev=(rev*10)+(num%10);
		}
		System.out.println("Reverse Number is:"+rev);
		if(rev==org_num) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome Number");
		}

	}

}
