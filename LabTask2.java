class LabTask2 {

    // Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix(Integer[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        Integer[] Presult = new Integer[col];
        Integer[] Fresult = new Integer[col - 1];
        for (int j = 0; j < col; j++) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                sum = sum + matrix[i][j];
            }
            Presult[j] = sum;
        }
        for (int i = 0; i < Fresult.length; i++) {
            Fresult[i] = Presult[i + 1] - Presult[i];
        }

        return Fresult;

    }

    public static void main(String[] args) {
        Integer[][] matrix = {
                { 1, 3, 1 },
                { 6, 4, 2 },
                { 5, 1, 7 },
                { 9, 3, 3 },
                { 8, 5, 4 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix(matrix);
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}