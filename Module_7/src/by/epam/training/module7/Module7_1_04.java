package by.epam.training.module7;

//4
//Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел

public class Module7_1_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, nod1 = 0, nod2 = 0;
		a = 4;
		b = 5;
		c = 6;

		nod1 = NOD1(a, b);
		//System.out.println("NOD1 = " + nod1);
		int nok1 = (a * b) / nod1;
		//System.out.println("NOK1 = " + nok1);
		
		nod2 = NOD2(nok1, c);
		int nok2 = (nok1 * c) / nod2;
		System.out.println("NOK = " + nok2);
	}

	public static int NOD1(int x1, int y1) {
		int nod1 = 0;
		int min1;
		min1 = Math.min(x1, y1);
		nod1 = min1;

		while ((x1 % nod1 != 0) || (y1 % nod1 != 0)) {
			nod1 = nod1 - 1;
			//System.out.println("nod1 " + nod1);
		}
		//System.out.println("nod1 " + nod1);
		return nod1;
	}

	public static int NOD2(int nok1, int d) {
		int nod2 = 0;
		int min2;
		min2 = Math.min(nok1, d);
		nod2 = min2;
		while ((nok1 % nod2 != 0) || (d % nod2 != 0)) {
			nod2 = nod2 - 1;
			//System.out.println("nod2 " + nod2);
		}
		//System.out.println("nod2 " + nod2);
		return nod2;
	}
}
