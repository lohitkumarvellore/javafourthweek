public class add2darray {
    public static void main(String[] args) {
        int rows = 3, columns = 4;
        int[][] MatrixA = { {1, 1, 1, 1}, {2, 3, 5, 2} , {4, 5, 6, 7}};
        int[][] MatrixB = { {2, 3, 4, 5}, {2, 2, 4, 6}, {1, 6, 7, 9} };
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = MatrixA[i][j] + MatrixB[i][j];
            }
        }
        System.out.println("Sum is: ");
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
