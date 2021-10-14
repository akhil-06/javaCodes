package classes_and_objects;

public class ComplexNumber {
	
	private int real;
	private int imaginary;

	
	public ComplexNumber (int real, int imaginary) {
		
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public int getImaginary() {
		return imaginary;
	}
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	public void print() {
		
		System.out.println(real + "+" + imaginary + "i");
	}
	public void add(ComplexNumber c2) {
		this.real = this.real + c2.real;
		this.imaginary = this.imaginary + c2.imaginary;
	}
	public void multiply(ComplexNumber c3) {
		this.real = this.real * c3.real;
		this.imaginary = this.imaginary * c3.imaginary;
	}
	public ComplexNumber conjugate() {
		int imaginary = - this.imaginary;
		return new ComplexNumber(this.real, imaginary);
	}
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c3) {
		int real = c1.real + c3.real;
		int imaginary = c1.imaginary + c3.imaginary;
		ComplexNumber c = new ComplexNumber(real, imaginary);
		return c;
	}
	

}
