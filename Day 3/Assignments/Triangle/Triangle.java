import java.util.Arrays;

//Class Triangle that checks the type of the triangle
public class Triangle {
	private int[] side=new int[3];

	public int[] getSide() {
		return side;
	}

	public void setSide(int[] side) {
		this.side = side;
	}
	
	//Method to check if a triangle is right angled triangle
	public boolean isRight(Triangle T)
	{
		int sideSquare1=T.side[0]*T.side[0];
		int sideSquare2=T.side[1]*T.side[1];
		int sideSquare3=T.side[2]*T.side[2];
		
		if((sideSquare1==sideSquare2+sideSquare3) || (sideSquare2==sideSquare1+sideSquare3) || (sideSquare3==sideSquare1+sideSquare2))
			return true;
		else
			return false;
	}
	//Method to check if a triangle is scalene
	public boolean isScalene(Triangle T)
	{
		if(T.side[0]!=T.side[1] && T.side[1]!=T.side[2]  && T.side[2]!=T.side[0])
			return true;
		else
			return false;
	}
	
	//Method to check if a triangle is iscosceles
	public boolean isIsosceles(Triangle T)
	{
		if(T.side[0]==T.side[1] || T.side[1]==T.side[2]  || T.side[2]==T.side[0])
			return true;
		else
			return false;
	}
	
	//method to check if a triangle is equilateral
	public boolean isEquilateral(Triangle T)
	{
		if(T.side[0]==T.side[1] && T.side[1]==T.side[2]  && T.side[2]==T.side[0])
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Triangle [side=" + Arrays.toString(side) + "]";
	}	
}
