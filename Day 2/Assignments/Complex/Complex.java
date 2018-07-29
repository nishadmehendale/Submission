//Complex class which performs addition and returns third object 
public class Complex {
	//instance members
	private float real;
	private float imaginary;
	
	//Empty constructor
	public Complex(){
		
	}
	
	//method to get real value
	public float getReal() {
		return real;
	}
	
	//method to set real value
	public void setReal(float real) {
		this.real = real;
	}
	
	//method to get imaginary
	public float getImaginary() {
		return imaginary;
	}
	
	//method to set imaginary
	public void setImaginary(float imaginary) {
		this.imaginary = imaginary;
	}
	
	//method to add two complex numbers
	public Complex addComplex(Complex Complex1,Complex Complex2) {
		Complex complexSum = new Complex();
		complexSum.real = Complex1.getReal() + Complex2.getReal();
		complexSum.imaginary = Complex1.getImaginary() + Complex2.getImaginary();
		return complexSum;
	}
	
	//tostring override
	@Override
	public String toString() {
		return "Complex [real=" + real + ", imaginary=" + imaginary + "]";
	}
	
}
