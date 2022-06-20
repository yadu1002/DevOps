public class Factorial
{
	public static void main(String[] args)
	{	final int NUM_FACTS = 100;
		for(int i = 0; i < NUM_FACTS; i++)
			System.out.println( i + "! is " + factorial(i));
	}
	
	public static int factorial(int n)
	{	int result = 1;
		for(int i = 2; i <= n; i++)
			result *= i;
		return result;
	}
}
//reviewed and commented by userfour
//reviewed and tested with the code with the test cases.
//
//reviewed the results of the testcases by usertwo
//verified with the dev team for any other changes.
//the code is ready for deployment.
//
//
//
//
//reviewed by userone
//deployment was successful and the code is being pushed to production.
//anychenages or upgrades will not be accepted.
//reviewed and verified wiht the dev team for any final changes.
