

public class SeaBord {


    private String[][] field = new String[10][10];

    {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = ".";
            }
        }
    }

    void getField() {

        for (int y = 0, q = 9; y < field.length; y++, q--) {
            for (int p = 0, z = 9; p < field[y].length; p++, z--) {


                if (field[y][p] != field[y][9] && field[y][p] == "d" && field[y][p + 1] == "h") {
                    field[y][p + 1] = "d";
                }
                if (field[q][z] != field[q][0] && field[q][z] == "d" && field[q][z - 1] == "h") {
                    field[q][z - 1] = "d";
                }
                if (field[q][z] != field[0][z] && field[q][z] == "d" && field[q - 1][z] == "h") {
                    field[q - 1][z] = "d";
                }
                if (field[y][p] != field[9][p] && field[y][p] == "d" && field[y + 1][p] == "h") {
                    field[y + 1][p] = "d";
                }
            }
        }


        check();

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println(" ");
        }
    }

    void shoot(int line, int column, String issue) {
        if (line >= 0 && line < 10 && column >= 0 && column < 10) {
            if (issue == "h" || issue == "d" || issue == "m") {
                field[line][column] = issue;
            } else {
                System.out.println("Error, incorrect");
            }

        } else {
            System.out.println("Error, incorrect");
        }
    }

    String[][] check() {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == "d") {
                    field[i][j] = "X";
                    if (field[i][j] != field[0][j] && field[i - 1][j] != "X" && field[i - 1][j] != "d") {
                        field[i - 1][j] = "#";
                    }
                    if (field[i][j] != field[i][0] && field[i][j - 1] != "X" && field[i][j - 1] != "d") {
                        field[i][j - 1] = "#";
                    }
                    if (field[i][j] != field[9][j] && field[i + 1][j] != "X" && field[i + 1][j] != "d") {
                        field[i + 1][j] = "#";
                    }
                    if (field[i][j] != field[i][9] && field[i][j + 1] != "X" && field[i][j + 1] != "d") {
                        field[i][j + 1] = "#";
                    }
                    if (field[i][j] != field[0][j] && field[i][j] != field[i][0]) {
                        field[i - 1][j - 1] = "#";
                    }
                    if (field[i][j] != field[0][j] && field[i][j] != field[i][9]) {
                        field[i - 1][j + 1] = "#";
                    }
                    if (field[i][j] != field[9][j] && field[i][j] != field[i][0]) {
                        field[i + 1][j - 1] = "#";
                    }
                    if (field[i][j] != field[9][j] && field[i][j] != field[i][9]) {
                        field[i + 1][j + 1] = "#";
                    }
                }
                if (field[i][j] == "h") {
                    field[i][j] = "X";
                }
                if (field[i][j] == "m") {
                    field[i][j] = "#";
                }
            }
        }
        return field;
    }
}









