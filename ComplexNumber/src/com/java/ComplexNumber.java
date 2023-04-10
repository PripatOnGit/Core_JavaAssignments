package com.java;

public class ComplexNumber {
 int real_num;
 double imag_num;
	
	ComplexNumber(int r_num, double d){
		
		real_num = r_num;
		imag_num = d;
	}
	ComplexNumber(int r_num){
		real_num = r_num;
		imag_num = 0;
	}
	ComplexNumber(double i_num){
		imag_num = i_num;
		real_num = 0;
	}
	public void createComplexNumber() {
		 System.out.println("The Complex Number is: "+this.real_num+"+("+this.imag_num+")i");
	}
	public String toString() {
		return "The Complex Number is: "+this.real_num+"+("+this.imag_num+")i";
	}
	
	public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
		ComplexNumber cn = new ComplexNumber(0,0.0);
		cn.real_num = n1.real_num + n2.real_num;
		cn.imag_num = n1.imag_num +n2.imag_num;
		cn.createComplexNumber();
		
		return cn;
	}
	public void add(ComplexNumber n1) {
//		ComplexNumber res = new ComplexNumber(0,0);
//		res.real_num = this.real_num + n1.real_num ;
//		res.imag_num = this.imag_num + this.imag_num;
//		return res;
		
		this.real_num = this.real_num + n1.real_num;
		this.imag_num = this.imag_num + n1.imag_num;
		//this.createComplexNumber();
		//return this;
	}
	
	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber(3,2);
		c1.createComplexNumber();
		ComplexNumber c2 = new ComplexNumber(4,-2);
		c2.createComplexNumber();
		
		c1.add(c2);
		System.out.println(c1);
		
//		ComplexNumber c3 = ComplexNumber.add(c1, c2);
//		System.out.println("sum: "+c3);
//		
//		ComplexNumber c4 = new ComplexNumber(5);
//		c4.createComplexNumber();
		
		
	}
}
