package unit1;

public class Hometask111 {

	public static void main(String[] args) {
		double a, b; // два катета
		double c; // гипотенуза
		double p; // периметр
		double s; // площадь
		a = 4;
		b = 3;
		c = Math.sqrt(a * a + b * b);
		p = a + b + c;
		s = 0.5 * a * b;
		System.out.println("Периметр = " + p + " Площадь = " + s);
	}
}