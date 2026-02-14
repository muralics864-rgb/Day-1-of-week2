package week1.day1;

public class PrimeNumber {
    public static void main(String[] args) {
       
    	int num = 82;
    	boolean isPrime = true;
    	
    	for(int i=2; i<num/2; i++)
    	{
    		if(num%i==0)
    		{
    			isPrime = false;
    			break;
    		}
    	}
    	if(isPrime==true)
    	{
    		System.out.println("This number is  a Prime number");
    	}
    	else
    	{
    		System.out.println("This number is not a Prime Number");
    	}
    }
}