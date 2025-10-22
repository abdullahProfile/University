public class Matrix {
    private int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[] sumOfRows() {
        int[] rowSums = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rowSums[i] += matrix[i][j];
            }
        }
        return rowSums;
    }

    public int[] sumOfColumns() {
        int[] colSums = new int[matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                colSums[j] += matrix[i][j];
            }
        }
        return colSums;
    }

    public int sumAboveDiagonal() {
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                total += matrix[i][j];
            }
        }
        return total;
    }

    public int sumBelowDiagonal() {
        int total = 0;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                total += matrix[i][j];
            }
        }
        return total;
    }

    // Example usage
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Matrix matrix = new Matrix(arr);

        System.out.println("Sum of each row:");
        for (int sum : matrix.sumOfRows()) {
            System.out.print(sum + " ");
        }
        System.out.println();

        System.out.println("Sum of each column:");
        for (int sum : matrix.sumOfColumns()) {
            System.out.print(sum + " ");
        }
        System.out.println();

        System.out.println("Sum above diagonal: " + matrix.sumAboveDiagonal());
        System.out.println("Sum below diagonal: " + matrix.sumBelowDiagonal());
    }
}
