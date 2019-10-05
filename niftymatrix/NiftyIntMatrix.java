package niftymatrix;

public class NiftyIntMatrix {
	
	public static int[][] multiplyIntMatrices(int[][] matrix_a, int[][] matrix_b) {
		int x_dim = matrix_a.length;
		int y_dim = matrix_a[0].length;
		
		int[][] ret = new int[matrix_a.length][matrix_a[0].length];
		
		for (int x = 0; x < x_dim; x++) {
			for (int y = 0; y < y_dim; y++) {
				ret[x][y] = matrix_a[x][y] * matrix_b[x][y];
			}
		}		
		return ret;
	}
	
	public static int[][] subtractIntMatrices(int[][] matrix_a, int[][] matrix_b) {
		int x_dim = matrix_a.length;
		int y_dim = matrix_a[0].length;
		
		int[][] ret = new int[matrix_a.length][matrix_a[0].length];
		
		for (int x = 0; x < x_dim; x++) {
			for (int y = 0; y < y_dim; y++) {
				ret[x][y] = matrix_a[x][y] - matrix_b[x][y];
			}
		}		
		return ret;
	}
	
	public static int[][] addIntMatrices(int[][] matrix_a, int[][] matrix_b) {
		int x_dim = matrix_a.length;
		int y_dim = matrix_a[0].length;
		
		int[][] ret = new int[matrix_a.length][matrix_a[0].length];
		
		for (int x = 0; x < x_dim; x++) {
			for (int y = 0; y < y_dim; y++) {
				ret[x][y] = matrix_a[x][y] + matrix_b[x][y];
			}
		}		
		return ret;
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				System.out.printf("%d\t",  matrix[x][y]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
