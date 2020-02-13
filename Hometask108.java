package unit1;

public class Hometask108 {

public static void main (String[] args)  
    {
	double a,b,c, rav;
	a = 3;
	b = 18;
	c = 3;
	rav = (b+Math.sqrt(b*b+4*a*c))/(2*a)-Math.pow(a, 3) * c + 1 / Math.pow(b, 2);
		System.out.println("Значение - " + rav);
    }
}