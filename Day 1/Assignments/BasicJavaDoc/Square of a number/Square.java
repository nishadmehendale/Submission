//Class to calculate square of a number
import java.util.*;
class Ques1
{
	public static void main(String args [])
	{
		//accepting input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		//Calculating sqaure
		int s = sqr(num);
		System.out.println(num+"*1="+num+",Square:"+s);
	}
	
	//Square method for calculation of square of anumber
	public static int sqr(int n)
	{
		return n*n;
	}
}