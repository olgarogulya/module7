package by.epam.training.module7;

//7_2_1
//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class Module7_2_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 234, 345, 456, 565, 678 };
		int K = 5;
		int sum = 0;

		for (int i = 0; i < A.length; i++) {
			
			if (A[i] % K == 0) {
				sum = sum + A[i];
				//System.out.println("Ai " + A[i]);
				//System.out.println("sum1 " + sum);
			}
			//System.out.println("sum2 " + sum);
		//System.out.println("i " + i);
		}
		System.out.println("sum " + sum);
	}

}
