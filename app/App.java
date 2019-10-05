package app;

import niftymatrix.NiftyIntMatrix;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		
		int[][] arr1 = { { 1, 2 }, { 3, 4 } };
		int[][] arr2 = { { 1, 2 }, { 3, 4 } };
		int[][] arr3;
		
		System.out.println("add");
		arr3 = NiftyIntMatrix.addIntMatrices(arr1,  arr2);
		NiftyIntMatrix.printMatrix(arr3);
		
		System.out.println("subtract");
		arr3 = NiftyIntMatrix.subtractIntMatrices(arr1,  arr2);
		NiftyIntMatrix.printMatrix(arr3);
		
		System.out.println("multiply");
		arr3 = NiftyIntMatrix.multiplyIntMatrices(arr1,  arr2);
		NiftyIntMatrix.printMatrix(arr3);
	
	}

}
