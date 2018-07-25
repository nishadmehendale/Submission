//Class that checks if a number is palindrome or not
import java.util.*;
class Ques2arm
{
	public static void main(String args [])
	{
		//Accepting input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		//Checking if a number is armstrong or not
		int d,sum=0,copy=num;
		while(num > 0)
		{
			d = num%10;
			num=num/10;
			d = d*d*d;
			sum+=d;
		}
		
		//Displaying output
		if(sum == copy)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstring Number");
		}
	}
}