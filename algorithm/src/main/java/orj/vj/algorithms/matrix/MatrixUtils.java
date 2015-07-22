package orj.vj.algorithms.matrix;

public final class MatrixUtils {
	public static void printMatrix(char[][] matrix) {
		int rows = 0;
		while( rows < matrix.length ){
			int column = 0;
			while( column < matrix[rows].length){
				System.out.print(matrix[rows][column]);
				column++;
			}
				rows ++;
				System.out.println();
		}
		
	}
}
