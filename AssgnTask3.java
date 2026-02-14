public class AssgnTask3 {
    public static void playGame(Integer[][] arena) {

        int rows = arena.length;
        int cols = arena[0].length;
        int Point = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (arena[i][j] % 50 == 0 && arena[i][j] > 0) {

                    if (i - 1 >= 0 && arena[i - 1][j] == 2) {
                        Point += 2;
                    }

                    if (i + 1 < rows && arena[i + 1][j] == 2) {
                        Point += 2;
                    }

                    if (j - 1 >= 0 && arena[i][j - 1] == 2) {
                        Point += 2;
                    }

                    if (j + 1 < cols && arena[i][j + 1] == 2) {
                        Point += 2;
                    }
                }
            }
        }

        if (Point >= 10) {
            System.out.print("Points Gained: " + Point + ". Your team has survived the game.");
        } else {
            System.out.print("Points Gained: " + Point + ". Your team is out.");
        }

        // For this task you don't need to create any new 2D array
        // just print the result inside the function

        // TO DO
    }

    // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        Integer[][] arena = {
                { 0, 2, 2, 0 },
                { 50, 1, 2, 0 },
                { 2, 2, 2, 0 },
                { 1, 100, 2, 0 }
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);

        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");

        System.out.print("\nYour Output:\n");
        playGame(arena);

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
                { 0, 2, 2, 0, 2 },
                { 1, 50, 2, 1, 100 },
                { 2, 2, 2, 0, 2 },
                { 0, 200, 2, 0, 0 }
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);

        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");

        System.out.print("\nYour Output:\n");
        playGame(arena1);
    }
}
