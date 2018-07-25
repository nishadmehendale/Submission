//import java.util.*;
public class TestVehicle 
{

	public static void main(String args[])
	{
		
		//Scanner scanner=new Scanner(System.in);
		Vehicle [] vehicle = new Vehicle[5];
		for(int i=0;i<3;i++) {
			vehicle[i] = new Vehicle();
		}
		vehicle[3] = new Vehicle("Amit");
		vehicle[4] = new Vehicle("Ajit");
		
		//Starting each vehicle
		System.out.println("Vehicld details");
		for(int i=0;i<5;i++) {
			vehicle[i].changeSpeed(30);
			System.out.println(vehicle[i]);
		}
		
		//Stopping a vehicle
		System.out.println("Stopping a vehicle");
		vehicle[0].stop();
		System.out.println(vehicle[0]);
		
		//Changing direction of a vehicle and passing same degree
		System.out.println("Changing direction with same direction value");
		vehicle[1].changeDirection(0);
		
		//Changing direction of a vehicle to different degree
		System.out.println("Changing direction with different direction value");
		vehicle[2].changeDirection(35);
		System.out.println(vehicle[2]);
		
		//Setting owner name of a vehicle
		System.out.println("Setting Owner name to Albert");
		vehicle[0].setOwnerName("Albert");
		System.out.println(vehicle[0]);
		
		//Changing owner name of a vehicle
		System.out.println("Changing Owner name to Alfred from Albert");
		vehicle[0].setOwnerName("Albert");
		System.out.println(vehicle[0]);
		
		//Taking a left turn
		System.out.println("Taking a LEFT TURN");
		vehicle[3].turnLeftRight(1);
		System.out.println(vehicle[3]);
		
		//Taking a right turn
		System.out.println("Taking a RIGHT TURN");
		vehicle[3].turnLeftRight(0);
		
		//Getting highest identification number
		System.out.println("Highest identification number is " + Vehicle.getHighestIdentificationNumber());
		

	}
}