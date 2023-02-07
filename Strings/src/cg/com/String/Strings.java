package cg.com.String;

public class Strings {
	public static void main(String[] args) {
		String s = "Chandan";
		System.out.println(s);
		System.out.println(s.charAt(3));
		String s1 = new String("CHANDAN");
		System.out.println(s1);
		System.out.println(s.length());
		System.out.println(s.indexOf('a') 	 );
		System.out.println(s.contains("Chandn"));
		System.out.println(s.startsWith("n"));
		System.out.println(s.endsWith("b"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
	}
}
