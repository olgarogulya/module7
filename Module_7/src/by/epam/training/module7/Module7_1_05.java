package by.epam.training.module7;

//import java.util.Scanner;
//5
// Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел

public class Module7_1_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 0, min = 0;
		int sum = max(max) + min(min);
		System.out.println("max + min = " + sum);

	}

	public static int max(int max) {

		int a = 0, b = 0, c = 0;
		a = number1(a);
		b = number2(b);
		c = number3(c);

		max = Math.max(a, b);
		max = Math.max(max, c);

		// System.out.println("max = " + max);

		return max;

	}

	public static int min(int min) {

		int a = 0, b = 0, c = 0;
		a = number1(a);
		b = number2(b);
		c = number3(c);

		min = Math.min(a, b);
		min = Math.min(min, c);

		// System.out.println("min = " + min);

		return min;

	}

	public static int number1(int a) {

		// System.out.println("Enter a");
		// Scanner sc = new Scanner(System.in);
		// int a1 = sc.nextInt();
		int a1 = 1;
		// System.out.println("a1 = " + a1);

		return a1;

	}

	public static int number2(int b) {

		// System.out.println("Enter b");
		// Scanner sc = new Scanner(System.in);
		// int b1 = sc.nextInt();
		int b1 = 2;
		// System.out.println("b1 = " + b1);

		return b1;

	}

	public static int number3(int c) {

		// System.out.println("Enter c");
		// Scanner sc = new Scanner(System.in);
		// int c1 = sc.nextInt();
		int c1 = 3;
		// System.out.println("c1 = " + c1);

		return c1;

	}
}
