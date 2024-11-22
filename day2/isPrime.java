package week1.day2;

public class isPrime {

	public static void main(String[] args) {
	   int n=7;
	   for(int i=2;i<n;i++) {
		   if(n%i==0) {
			   System.out.println("Not Prime");
			   return;
		   }
	   }
	   System.out.println("Prime");

	}

}