//Tests complex Class and adds two complex numbers
public class ComplexTest {

	public static void main(String[] args) {
		//Complex objects initialization
		Complex Complex1 = new Complex();
		Complex Complex2 = new Complex();
		Complex Complex3 = new Complex();
		
		//setting Complex 1 real and imaginary outputs 
		Complex1.setReal(4.5f);
		Complex1.setImaginary(5.5f);
		System.out.println(Complex1);
		
		//setting Complex 2 real and imaginary outputs
		Complex2.setReal(3.5f);
		Complex2.setImaginary(6.5f);
		System.out.println(Complex2);
		
		//Adding two complex numbers
		Complex3= Complex1.addComplex(Complex1, Complex2);
		System.out.println(Complex3);
		
	}

}
