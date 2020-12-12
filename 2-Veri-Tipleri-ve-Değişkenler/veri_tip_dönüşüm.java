package Java;

public class veri_tip_dönüşüm {
	public static void main(String args[]) {
		// Stirng --> int
		String a = "5";
		int A1 = Integer.valueOf(a);
		int A2 = Integer.parseInt(a);
		System.out.println("String --> Int-dönüşüm-1 = " + A1);
		System.out.println("String --> Int-DÖnüşüm-2 = " + A2);

		// int --> String
		int b = 6;
		String B1 = String.valueOf(b);
		String B2 = Integer.toString(b);
		System.out.println("Int --> String-Dönüşüm-1 = " + B1);
		System.out.println("Int --> String-Dönüşüm-2 = " + B2);

		String c = "18";
		double C1 = Double.parseDouble(c);
		System.out.println("String --> Double-Dönüşüm = " + C1);

		short d = 12;
		String D1 = String.valueOf(d);
		System.out.println("Short --> String-Dönüşüm = " + D1);
	}
}
