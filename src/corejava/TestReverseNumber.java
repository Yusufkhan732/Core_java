package corejava;

public class TestReverseNumber {
	
public static void main(String args[]) {
		
	  	int number = 1234;
	  	
	  	int r = 0;
	  	 
	  	int sum = 0;
	  	
	  	int n = number;
	  	
	  	while(n>0) {
	  		
	  		r = n % 10;
	  		
	  		sum = (sum * 10) +r;
	  		
	  		n = n/10;
	  	}
	  	
	  	System.out.println("Reverse of " + number + " is " + sum);
	  	
	}
}