import java.util.Scanner;

public class HundirFlota {
    public static void main(String[] args) {

        char[][] tableroA = new char[11][11];
        char[][] tableroB = new char[11][11];
        char[][] tableroC = new char[11][11];
        char[][] tableroD = new char[11][11];
        char[] barcos = new char[5];

        crearTablero(tableroA);
        crearTablero(tableroB);
        crearTablero(tableroC);
        crearTablero(tableroD);

//      nombre();
        showJugador(tableroA, tableroB);
        showPC(tableroC, tableroD);
    }

    /**
     * Limpia la pantalla
     *
     * @clean limpia pantalla
     */
    public static void clean() {
        System.out.flush();
    }

    /**
     * Muestra en pantalla el tablero del jugador
     *
     * @param arrayD Muestra los tableros de los Disparos
     * @param arrayP Muestra los tableros de las Posiciones
     */
    public static void showJugador(char[][] arrayD, char[][] arrayP) {
        clean();
        System.out.println("\t TU TABLERO \t\t\t TU TABLERO");
        for (int fila = 0; fila < arrayD.length; fila++) {
            for (int columna = 0; columna < arrayD[0].length; columna++) {
                System.out.print(arrayD[fila][columna]);
                System.out.print(' ');

            }
            System.out.print("\t");

            for (int columna = 0; columna < arrayD[0].length; columna++) {
                System.out.print(arrayP[fila][columna]);
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Muestra en pantalla el tablero del pc
     *
     * @param arrayD Muestra los tableros de los Disparos
     * @param arrayP Muestra los tableros de las Posiciones
     */
    public static void showPC(char[][] arrayD, char[][] arrayP) {
        clean();
        System.out.println("\t PC TABLERO \t\t\t PC TABLERO");
        for (int fila = 0; fila < arrayD.length; fila++) {
            for (int columna = 0; columna < arrayD[0].length; columna++) {
                System.out.print(arrayD[fila][columna]);
                System.out.print(' ');

            }
            System.out.print("\t");

            for (int columna = 0; columna < arrayD[0].length; columna++) {
                System.out.print(arrayP[fila][columna]);
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();
    }

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

    public static void posicionJugador(int barco, char[][] posicion) {
        Scanner sc = new Scanner(System.in);


    }

    public static int posY() {
        Scanner sc = new Scanner(System.in);
        int Y;
        do {
            System.out.println("Dime una coordenada entre el 0-9: ");
            Y = sc.nextInt();
            if (Y < 10 && Y >= 0) {
                Y = Y;
            } else {
                System.out.println("ERROR!! La coordenada que has puesto esta mal!");
            }
        } while (Y > 10 || Y < 0);
        return Y;
    }


    /**
     * Pone el nombre del jugador
     *
     * @nombre pone tu nombre
     */
    public static void nombre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre para empezar: ");
        String nombre = sc.next();
    }

}
