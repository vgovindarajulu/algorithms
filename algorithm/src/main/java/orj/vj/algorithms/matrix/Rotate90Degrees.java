package orj.vj.algorithms.matrix;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is
 * 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
 * place?
 * Given  --> Output
 * abcd       	miea
 * efgh			njfb
 * ijkl			okgc
 * mnop			plhd
 * 
 * Solution : 
 * 	Rotate the outer loop 
 *  Rotate the inner loop
 *  
 * @author vijay
 */
public class Rotate90Degrees {
	static char[][] matrix = { {'a','b','c','d'},
							   {'e','f','g','h'},
							   {'i','j','k','l'},
							   {'m','n','o','p'}};
	
	public static void main(String[] args) {
		MatrixUtils.printMatrix(matrix);
		char[][] rotated90  = rotateMatrix(matrix, 4);
		System.out.println("---------------- rotated --------------");
		MatrixUtils.printMatrix(rotated90);
		
	}

	private static char[][] rotateMatrix(char[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; ++layer) {
			 int first = layer;
			 int last = n - 1 - layer;
			for(int i = first; i < last; ++i) {
			int offset = i - first;
			// save top
			 char top = matrix[first][i];
			
			 // left -> top
			 matrix[first][i] = matrix[last-offset][first];
			
			 // bottom -> left
			 matrix[last-offset][first] = matrix[last][last - offset];
			
			 // right -> bottom
			 matrix[last][last - offset] = matrix[i][last];
			
			 // top -> right
			 matrix[i][last] = top;
			 }
		 }
		return matrix;
	}
}
