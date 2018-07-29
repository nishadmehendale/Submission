//Distance Class containing measures in Feet and Inches
public class Distance {
	//Instance members
	private int feet;
	private float inches;
	
	//get feet value
	public int getFeet() {
		return feet;
	}
	
	//set feet value
	public void setFeet(int feet) {
		this.feet = feet;
	}
	
	//get inches
	public float getInches() {
		return inches;
	}
	
	//set inches
	public void setInches(float inches) {
		if(inches<12.0)
			this.inches = inches;
	}

	//add two distances
	public Distance addDistance(Distance D1,Distance D2) {
		Distance D3 = new Distance();
		D3.inches = D1.getInches() + D2.getInches();
		D3.feet = D1.getFeet() + D2.getFeet();
		if(D3.inches >= 12.0)
			{
				D3.feet += 1;
				D3.inches -= 12.0;
			}
		
		return D3;
	}
	
	//to string override
	@Override
	public String toString() {
		return "Distance [feet=" + feet + ", inches=" + inches + "]";
	}
}
