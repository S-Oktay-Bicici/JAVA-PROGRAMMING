package Java;

public class veri_tip_dönüşüm_1 {
	static void main(String args[]) {
		int x = 130;
		double y = x;
		System.out.println("Double veri tipine dönüştürülen sayı = " + y);

		// byte<short<int<long<float<double

		double a = 10.13d;
		int b = (int) a;
		System.out.println("Int'e Dönüştürülen  sayı = " + b);

		long s = 668;
		float t = s;
		System.out.println("Float'a Dönüştürülen sayı = " + t);
	}
}
