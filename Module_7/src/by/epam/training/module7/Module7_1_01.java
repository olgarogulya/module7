package by.epam.training.module7;

public class Module7_1_01 {
	// 1
	// Треугольник задан координатами своих вершин. Написать метод для вычисления
	// его площади

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 0, b = 0, c = 0;
		a = storona_a(a);
		b = storona_b(b);
		c = storona_c(c);
		
		double P, p; // периметр и полупериметр

		P = a + b + c;
		p = P / 2;

		//System.out.println("полупериметр треугольника равен " + p);
	
		double S; // площадь
		S = Math.sqrt(P * (p - a) * (p - b) * (p - c));
		System.out.println("площадь треугольника равна " + S);
		
	}

	public static double storona_a(double a) {

		double x1, y1; // координаты a
		double x2, y2; // координаты b
		double ab; // стороны треугольника

		x1 = 3;
		y1 = 4;
		x2 = 6;
		y2 = 12;

		ab = Math.hypot(Math.abs(x2 - x1), Math.abs(y2 - y1));
		//System.out.println("storona a = " + ab);

		return ab;

	}

	public static double storona_b(double b) {

		double x2, y2; // координаты b
		double x3, y3; // координаты c
		double bc; // стороны треугольника

		x2 = 6;
		y2 = 12;
		x3 = 9;
		y3 = 7;

		bc = Math.hypot(Math.abs(x3 - x2), Math.abs(y3 - y2));
		//System.out.println("storona b = " + bc);

		return bc;

	}

	public static double storona_c(double c) {

		double x1, y1; // координаты a
		double x3, y3; // координаты c
		double ac; // стороны треугольника

		x1 = 3;
		y1 = 4;
		x3 = 9;
		y3 = 7;

		ac = Math.hypot(Math.abs(x3 - x1), Math.abs(y3 - y1));
		//System.out.println("storona c = " + ac);

		return ac;

	}
}
