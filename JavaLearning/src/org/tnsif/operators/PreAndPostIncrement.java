package org.tnsif.operators;

public class PreAndPostIncrement {

	public static void main(String[] args) {
		
		int a=5;
		int b=6;
		int c=7;
		
		b=c++;
		System.out.println(b);
		c=--c+b--;
		System.out.println(c);
		System.out.println(c);
		
	}

}
