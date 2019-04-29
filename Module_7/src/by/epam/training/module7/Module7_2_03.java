package by.epam.training.module7;

public class Module7_2_03 {

	// 7_2_03
	// Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число
	// встречается раньше - положительное или отрицательное.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length = (int) (Math.random() * 20 + 0);
		System.out.println("length " + length);
		
		int[] array = new int[length];
		
		int a = 0;
		int b = 0;

		for (int i = 0; i < array.length; i++) {
			
			array[i] = ((int) (Math.random() * 200 - 100));
			//System.out.println(array[i]);
			
			if (array[i] < 0) {
				a = a + 1;
				//System.out.println("a " + a);
			} else {
				b = b + 1;
				//System.out.println("b " + b);
			}
		}
		System.out.println("a " + a);
		System.out.println("b " + b);

		if (a > b) {
			System.out.println("Чаще встречаются положительные числа");
		}
		if (a < b) {
			System.out.println("Чаще встречаются отрицательные числа");
		}
		else {
			System.out.println("Количество положительных и отрицательных чисел равно");
		}
	}

}
