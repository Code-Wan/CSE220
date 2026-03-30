public class AssgnTask4 {

    public static void rotateSecret(Character[][] board) {
        int n = board.length;
        int numberLayer = n / 2;
        for (int i = 0; i < numberLayer; i++) {
            int rotations = numberLayer - i;
            for (int r = 0; r < rotations; r++) {
                rotateLayerClockwise(board, i);
            }
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.print(board[r][c]);
            }
        }
        System.out.println();
    }

    private static void rotateLayerClockwise(Character[][] board, int layer) {
        int n = board.length;
        int First = layer;
        int Last = n - 1 - layer;

        for (int i = First; i < Last; i++) {
            int offset = i - First;

            Character top = board[First][i];

            board[First][i] = board[Last - offset][First];

            board[Last - offset][First] = board[Last][Last - offset];

            board[Last][Last - offset] = board[i][Last];

            board[i][Last] = top;
        }

    }

    // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        System.out.print("===========Test#1===========\n");
        Character[][] board = {
                { 'T', 'A', 'U', 'S' },
                { 'A', 'R', 'I', '.' },
                { 'D', 'T', 'T', 'N' },
                { 'S', 'C', 'F', 'U' }
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        Character[][] outputBoard = {
                { 'D', 'A', 'T', 'A' },
                { 'S', 'T', 'R', 'U' },
                { 'C', 'T', 'I', 'S' },
                { 'F', 'U', 'N', '.' }
        };
        System.out.print("DATASTRUCTISFUN.\n");
        Arr.print2D(outputBoard);

        System.out.print("\nYour Output:\n");
        rotateSecret(board);
        Arr.print2D(board);

        if (Arr.compare2D(outputBoard, board))
            System.out.print("Test 1 Success");
        else
            System.out.println("Test 1 FAILED");

        System.out.print("\n===========Test#2===========\n");

        board = new Character[][] {
                { 'O', 'R', 'I', 'R', 'N', 'P' },
                { 'G', 'S', 'A', 'A', 'L', 'R' },
                { 'L', 'M', 'N', 'O', 'N', 'Y' },
                { 'A', 'H', 'U', 'O', 'O', 'P' },
                { 'T', 'F', 'C', 'T', 'H', 'S' },
                { 'E', 'D', 'Y', 'O', 'C', 'K' }
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        outputBoard = new Character[][] {
                { 'A', 'L', 'G', 'O', 'R', 'I' },
                { 'T', 'H', 'M', 'S', 'A', 'R' },
                { 'E', 'F', 'U', 'N', 'A', 'N' },
                { 'D', 'C', 'O', 'O', 'L', 'P' },
                { 'Y', 'T', 'H', 'O', 'N', 'R' },
                { 'O', 'C', 'K', 'S', 'P', 'Y' }
        };
        System.out.print("ALGORITHMSAREFUNANDCOOLPYTHONROCKSPY\n");
        Arr.print2D(outputBoard);

        System.out.print("\nYour Output:\n");
        rotateSecret(board);
        Arr.print2D(board);

        if (Arr.compare2D(outputBoard, board))
            System.out.print("Test 2 Success");
        else
            System.out.println("Test 2 FAILED");
    }
}
