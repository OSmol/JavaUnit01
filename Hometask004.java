package unit1;

public class Hometask004 {
		public static void main(String[] args) {
		double a, b; // катеты
		double c; // гипотенуза
		double s; // площадь
		
		a = 6;
		b = 4;
		c = Math.sqrt(a * a + b * b);
		s = 0.5 * a * b;
		System.out.println("Гипотенуза = " + c + " Площадь = " + s);
}
}
