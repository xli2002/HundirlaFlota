public class Tablero {
    /**
     * Crea los tableros
     *
     * @param tablero Hace que rellene todo de '~' y tambien que los lados pongan los numeros y debajo las letra.
     */
    public static void crearTablero(char[][] tablero) {
        for (int columna = 1; columna < tablero.length; columna++) {
            for (int fila = 0; fila < tablero.length - 1; fila++) {
                tablero[fila][columna] = '~';

                tablero[0][0] = '0';
                tablero[1][0] = '1';
                tablero[2][0] = '2';
                tablero[3][0] = '3';
                tablero[4][0] = '4';
                tablero[5][0] = '5';
                tablero[6][0] = '6';
                tablero[7][0] = '7';
                tablero[8][0] = '8';
                tablero[9][0] = '9';
                tablero[10][0] = '*';

                tablero[10][1] = 'A';
                tablero[10][2] = 'B';
                tablero[10][3] = 'C';
                tablero[10][4] = 'D';
                tablero[10][5] = 'E';
                tablero[10][6] = 'F';
                tablero[10][7] = 'G';
                tablero[10][8] = 'H';
                tablero[10][9] = 'I';
                tablero[10][10] = 'J';

            }
        }
    }
}

