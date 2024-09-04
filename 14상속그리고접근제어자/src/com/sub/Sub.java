package com.sub;

import com.sup.Super;

public class Sub extends Super {

	private int num5;
	
	public void print() {
		
		System.out.println("num1 = " + super.num1);
		System.out.println("num2 = " + super.num2);
		System.out.println("num3 = " + super.getNum3());
		System.out.println("num4 = " + super.getNum4());
		System.out.println("num5 = " + this.num5);
	}

	public static void main(String[] args) {
		
		Sub s = new Sub();
		s.print();
	}

}
