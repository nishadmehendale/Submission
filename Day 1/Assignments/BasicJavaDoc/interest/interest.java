import java.util.*;
class interest
{
	public static void main(String args [])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter principle amount");
		int principalAmount = sc.nextInt();
		System.out.println("Enter rate of interest");
		float rateOfInterest = sc.nextFloat();
		System.out.println("Enter number of years");
		int numberOfYears = sc.nextInt();
		double simpleInterest,compoundInterest,amount;
		simpleInterest = (double)(principal*numberOfYears*rateOfInterest)/100;
		amount = (double)principalAmount*Math.pow((1f+rateOfInterest/100f),numberOfYears);
		compondInterest = amount - principalAmount;
		System.out.println("Simple Interest");
		System.out.println(simpleInterest);
		System.out.println("Compound Interest");
		System.out.println(compounfInterest);
	}
}
