package unit1;

public class Hometask110 {
public static void main(String[] args) {
double x = 5.3;
double y = 8.6;
double a, b, c, d, e, total;

a = Math.sin(x);
b = Math.cos(x);
c = Math.sin(y);
d = Math.cos(y);
e = Math.tan(x * y);
total = ((a + d) / (b - c)) * e;
if (b - c != 0) {
total = ((a + d) / (b - c)) * e;
System.out.println("Значение выражения = " + total);
}
else {System.out.println("Знаменатель равен нулю");
}
}
}
