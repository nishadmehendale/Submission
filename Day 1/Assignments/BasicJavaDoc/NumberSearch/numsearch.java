//Class to search a number in an array
import java.util.*;
class numsearch
{
	public static void main(String args [])
	{
		//Accepting array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of array");
		int arr[] = new int [15];
		int flag = 0;
		for(int i=0;i<15;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//Accepting number to be searched
		System.out.println("Enter the value to be searched");
		int num = sc.nextInt();
		
		//Searching the number
		for(int i=0;i<15;i++)
		{
			if(arr[i]==num).
			{
				System.out.println("Number found at loc "+(i+1));
				flag = 1;
			}
			
		}
		
		//Checking if number is not found
		if(flag == 0)
		{
			System.out.println("Number not found");
		}
	}
}
