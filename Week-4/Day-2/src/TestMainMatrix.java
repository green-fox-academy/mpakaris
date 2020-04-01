import java.util.Arrays;

public class TestMainMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        printMatrix(mat);
        // Call: rotate Matrix;
        int[][] matCW = rotateCW(mat);
        // Print: rotated Matrix;
        printMatrix(matCW);
    }

    static void printMatrix(int[][] mat) {
        System.out.println("Matrix: ");
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }

    static int[][] rotateCW(int[][] mat) {
        int M = mat.length;
        int N = mat[0].length;
        int[][] ret = new int[N][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                ret[j][M-1-i] = mat[i][j];
            }
        }
        return ret;
    }









}
