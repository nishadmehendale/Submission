import java.util.*;
//Class TestTriangle that tests class Triangle and displays triangle type
public class TestTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Accepting input
		System.out.println("Enter number of triangles");
		int num = sc.nextInt();
		int sides[] = new int[3];
		Triangle[] triangle = new Triangle[num];
		for(int i=0;i<num;i++){
			triangle[i] = new Triangle();
			System.out.println("Enter the sides");
			sides[0] = sc.nextInt();
			sides[1] = sc.nextInt();
			sides[2] = sc.nextInt();
			triangle[i].setSide(sides);
			System.out.println(triangle[i]);
			if(triangle[i].isRight(triangle[i])){
				System.out.println("Triangle is right angled");
			}
			if(triangle[i].isScalene(triangle[i])){
				System.out.println("Triangle is scalene");
			}
			else if(triangle[i].isEquilateral(triangle[i])){
				System.out.println("Triangle is equilateral");
			}
			else if(triangle[i].isIsosceles(triangle[i]){
				System.out.println("Triangle is isosceles");
			}
		}			
		
	}
}
