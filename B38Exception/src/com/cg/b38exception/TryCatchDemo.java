package com.cg.b38exception;

public class TryCatchDemo {

	public static void main(String[] args) {
		String str=null;
		
		try {
			str.equals("hello");
			
		}catch(NullPointerException ex) {
			str=new String("hello");
			System.out.println(str.equals("hello"));
					
		}
		System.out.println("Continue the program");
	}

}
