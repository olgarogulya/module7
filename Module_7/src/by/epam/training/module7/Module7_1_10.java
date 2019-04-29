package by.epam.training.module7;

//10
//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9

public class Module7_1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 9; i++) {

			if (i % 2 != 0) {
				int mult = 1;
				
				for (int a = 1; a <= i; a++) {
					mult = mult * a;
					// System.out.println("mult1 " + mult);
				}
				// System.out.println("mult2 " + mult);
				sum = sum + mult;
				// System.out.println("sum1 " + sum);
			}
		}
		System.out.println("Сумма факториалов " + sum);
	}

}
