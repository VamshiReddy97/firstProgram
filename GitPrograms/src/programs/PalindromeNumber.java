package programs;

public class PalindromeNumber {

	public static void main(String[] args) {

    int r,sum=0,temp;
    int n=454; //it is the number variables to be check for palindrom
    temp=n;
    while(n>0) {
    	r=n%10;//getting reminder
    	sum=(sum*10)+r;
    	n=n/10;
    }
    if(temp==sum) {
    	System.out.println("It is a palindrome"); 
    }
    else {
    	System.out.println("It is not a Palindrome");
    }
	}

}
