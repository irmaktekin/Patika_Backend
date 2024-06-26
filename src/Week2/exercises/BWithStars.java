package Week2.exercises;

public class BWithStars{

    public static void main(String[] args) {
        //Matrix is declared with 7 rows and 4 columns.
        String[][] letter = new String[7][4];

        //for the specific i values, * is assigned for creating B letter.
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        //It prints the pattern
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

