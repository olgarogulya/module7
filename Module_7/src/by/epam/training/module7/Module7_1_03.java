package by.epam.training.module7;

//3
//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

public class Module7_1_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, d, nod = 0;
		a = 44;
		b = 33;
		c = 22;
		d = 11;
		
		nod = NOD(a, b, c, d);
		System.out.println("NOD = " + nod);
		}

	public static int NOD(int x, int y, int z, int v) {
		int nod = 0;
		
		int min;
		min = Math.min(x, y);
		min = Math.min(min, z);
		min = Math.min(min, v);
		
			nod = min;
				
		while ((x % nod != 0) || (y % nod != 0) || (z % nod != 0) || (v % nod != 0)) {
			nod = nod - 1;
			 System.out.println("nod1 " + nod);
		}
		 System.out.println("nod " + nod);
		 System.out.println("x " + x);
		 System.out.println("y " + y);
		 System.out.println("z " + z);
		 System.out.println("v " + v);
		
		 return nod;
	}

}
