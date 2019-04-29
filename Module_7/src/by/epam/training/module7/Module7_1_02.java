package by.epam.training.module7;

//2
// Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего
//кратного двух натуральных чисел

public class Module7_1_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, nod = 0;
		a = 90;
		b = 72;
		nod = NOD(a, b);
		System.out.println("NOD = " + nod);
		int nok = (a * b) / nod;
		System.out.println("NOK = " + nok);
	}

	public static int NOD(int x, int y) {
		int nod = 0;
		if (x > y) {
			nod = y;
		} else {
			nod = x;
		}

		while ((x % nod != 0) || (y % nod != 0)) {
			nod = nod - 1;
			// System.out.println("nod1 " + nod);
		}
		// System.out.println("nod " + nod);
		// System.out.println("x " + x);
		// System.out.println("y " + y);
		return nod;
	}

}