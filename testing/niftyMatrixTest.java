package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import niftymatrix.NiftyIntMatrix;

public class niftyMatrixTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.square(5);
		assertEquals(25, output);
		
		int[][] matrix_a = { { 3, 2 }, { 1, 4 } };
		int[][] matrix_b = { { 4, 2 }, { 1, 7 } };
		
		// Test add
		int[][] actual = NiftyIntMatrix.addIntMatrices(matrix_a, matrix_b);
		int[][] expected = { { 7, 4 }, { 2, 11 } };
		assertArrayEquals(actual, expected);
		
		// Test subtract
		actual = NiftyIntMatrix.subtractIntMatrices(matrix_a, matrix_b);
		expected = new int[][]{ { -1, 0 }, { 0, -3 } };
		assertArrayEquals(actual, expected);
		
		// Test multiply
		actual = NiftyIntMatrix.multiplyIntMatrices(matrix_a, matrix_b);
		expected = new int[][]{ { 12, 4 }, { 1, 28 } };
		assertArrayEquals(actual, expected);
	}

}
