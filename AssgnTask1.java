public class AssgnTask1 {
    public static Integer rowRotation(Integer examWeek, String[][] matrix) {
        int i = 0;
        int j = matrix.length - 1;
        while (i < j) {
            String[] temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j--;
        }
        i = 0;
        j = (examWeek % matrix.length - 1);
        while (i < j) {
            String[] temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j--;
        }
        i = (examWeek % matrix.length + 1);
        j = matrix.length - 1;
        while (i < j) {
            String[] temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j--;
        }

        for (int k = 0; k < matrix.length; k++) {
            for (int y = 0; y < matrix[0].length; y++) {
                if (matrix[k][y].equals("AA")) {
                    return k;
                }

            }

        }

        // For this task you don't need to create new Matrix
        // You can create 1D array if you need (but you can do it without creating any
        // 1D array as well)
        // After rotation the Matrix should be printed inside the method
        // Only the integer row number is to be returned

        // TO DO
        return null;
    }

    // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        String[][] seatStatus = {
                { "A", "B", "C", "D", "E" },
                { "F", "G", "H", "I", "J" },
                { "K", "L", "M", "N", "O" },
                { "P", "Q", "R", "S", "T" },
                { "U", "V", "W", "X", "Y" },
                { "Z", "AA", "BB", "CC", "DD" }
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);

        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");

        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        // This following should print modified seat status after rotation and return
        // the current exam week
        Integer rowNumber = rowRotation(examWeek, seatStatus);
        // The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row " + rowNumber);
    }
}
