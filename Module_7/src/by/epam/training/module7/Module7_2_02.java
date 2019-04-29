package by.epam.training.module7;

//import java.util.Arrays;

//7_2_02
//В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этиx элементов

public class Module7_2_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 0, 2, 0, 0, 3, 0, 0, 5, 6 };
		// int sum = 0;
		int a = 0;

		for (int i = 0; i < A.length; i++) {

			if (A[i] == 0) {
			a = i;
		//	System.out.println("a" + i + "=" + a);
			System.out.println(a);
			//int[] B;
			//B = new int [a];
			 //System.out.println(Arrays.toString(B));
			 }
			
			
			//System.out.println(a);
			
		}
		
		
		
		// System.out.println("sum " + sum);
	}

}
