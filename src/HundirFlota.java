import java.util.Scanner;

public class HundirFlota {
    public static void main(String[] args) {

        char[][] tableroA = new char[11][11];
        char[][] tableroB = new char[11][11];
        char[][] tableroC = new char[11][11];
        char[][] tableroD = new char[11][11];
        int[] barcos = {5, 4, 3, 3, 2};

        crearTablero(tableroA);
        crearTablero(tableroB);
        crearTablero(tableroC);
        crearTablero(tableroD);

//      nombre();
        barcos(tableroA, tableroB, tableroC, tableroD, barcos);
        showJugador(tableroA, tableroB);

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
        System.out.println("\t TU TABLERO \t\t\t TUS DISPAROS");
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

    public static void barcos(char[][] A, char[][] B, char[][] C, char[][] D, int barcos[]) {
        for (int i = 0; i < barcos.length; i++) {
            System.out.println("En que coordenada quieres el barco de " + barcos[i] + " ? ");
            posicionJugador(barcos[i], A);
            clean();
            showJugador(A, B);
        }
    }

    public static void posicionJugador(int barco, char[][] array) {
        Scanner sc = new Scanner(System.in);
        int Y = posY();
        int X = posX();

        if (barco != 1) {
            System.out.println("Como quieres el barco Horizontalmente(0) o Verticalmente(1) ?");
            int horizontal = sc.nextInt();
            if (horizontal == 0) {
                if (X + barco > 10) {
                    if (!compruebaX(array, Y, X, barco))
                        for (int i = 0; i < barco; i++) {
                            array[Y][X - i] = 'B';
                        }
                    else {
                        System.out.println("ERROR!! No puedes poner el barco alli !!");
                        posicionJugador(barco, array);
                    }
                } else {
                    if (!compruebaX(array, Y, X, barco))
                        for (int i = 0; i < barco; i++) {
                            array[Y][X + i] = 'B';
                        }
                    else {
                        System.out.println("ERROR!! No puedes poner el barco alli !!");
                        posicionJugador(barco, array);
                    }
                }

            } else {
                if (Y + barco > 10) {
                    if (!compruebaY(array, Y, X, barco))
                        for (int i = 0; i < barco; i++) {
                            array[Y - i][X] = 'B';
                        }
                    else {
                        System.out.println("ERROR!! No puedes poner el barco alli !!");
                        posicionJugador(barco, array);
                    }
                } else {
                    if (!compruebaY(array, Y, X, barco))
                        for (int i = 0; i < barco; i++) {
                            array[Y + i][X] = 'B';
                        }
                    else {
                        System.out.println("ERROR!! No puedes poner el barco alli !!");
                        posicionJugador(barco, array);
                    }
                }
            }
        } else {
            if (array[Y][X] == '~') {
                array[Y][X] = 'B';
            } else {
                System.out.println("ERROR!! No puedes poner el barco alli !!");
                posicionJugador(barco, array);
            }
        }
    }


    /**
     * Comprueba si hay algun barco horizontalmente
     *
     * @return devuelve comprueba
     */
    public static boolean compruebaX(char[][] array, int Y, int X, int barco) {
        boolean comprueba = true;

        if (barco == 5) {
            if (X + barco > 10) {
                if (array[Y][X] == '~' && array[Y][X - 1] == '~' && array[Y][X - 2] == '~' && array[Y][X - 3] == '~' && array[Y][X - 4] == '~')
                    comprueba = false;
                else
                    comprueba = true;
            } else {
                if (array[Y][X] == '~' && array[Y][X + 1] == '~' && array[Y][X + 2] == '~' && array[Y][X + 3] == '~' && array[Y][X + 4] == '~')
                    comprueba = false;
                else
                    comprueba = true;
            }
        } else if (barco == 4) {
            if (X + barco > 10) {
                if (array[Y][X] == '~' && array[Y][X - 1] == '~' && array[Y][X - 2] == '~' && array[Y][X - 3] == '~')
                    comprueba = false;
                else
                    comprueba = true;
            } else {
                if (array[Y][X] == '~' && array[Y][X + 1] == '~' && array[Y][X + 2] == '~' && array[Y][X + 3] == '~')
                    comprueba = false;
                else
                    comprueba = true;
            }
        } else if (barco == 3) {
            if (X + barco > 10) {
                if (array[Y][X] == '~' && array[Y][X - 1] == '~' && array[Y][X - 2] == '~')
                    comprueba = false;
                else
                    comprueba = true;
            } else {
                if (array[Y][X] == '~' && array[Y][X + 1] == '~' && array[Y][X + 2] == '~')
                    comprueba = false;
                else
                    comprueba = true;
            }
        } else if (barco == 2) {
            if (X + barco > 10) {
                if (array[Y][X] == '~' && array[Y][X - 1] == '~')
                    comprueba = false;
                else
                    comprueba = true;
            } else {
                if (array[Y][X] == '~' && array[Y][X + 1] == '~')
                    comprueba = false;
                else
                    comprueba = true;
            }
        }
        return comprueba;
    }

    /**
     * Comprueba si hay algun barco verticalmente
     *
     * @return devuelve comprueba
     */
    public static boolean compruebaY(char[][] array, int Y, int X, int barco) {
        boolean comprueba = true;

        if (barco == 5) {
            if (Y + barco > 10) {
                if (array[Y][X] == '~' && array[Y - 1][X] == '~' && array[Y - 2][X] == '~' && array[Y - 3][X] == '~' && array[Y - 4][X] == '~')
                    comprueba = false;
                else
                    comprueba = true;
            } else {
                if (array[Y][X] == '~' && array[Y + 1][X] == '~' && array[Y + 2][X] == '~' && array[Y + 3][X] == '~' && array[Y + 4][X] == '~')
                    comprueba = false;
                else
                    comprueba = true;
            }
        } else if (barco == 4) {
            if (Y + barco > 10) {
                if (array[Y][X] == '~' && array[Y - 1][X] == '~' && array[Y - 2][X] == '~' && array[Y - 3][X] == '~')
                    comprueba = false;
                else
                    comprueba = true;
            } else {
                if (array[Y][X] == '~' && array[Y + 1][X] == '~' && array[Y + 2][X] == '~' && array[Y + 3][X] == '~')
                    comprueba = false;
                else
                    comprueba = true;
            }
        } else if (barco == 3) {
            if (Y + barco > 10) {
                if (array[Y][X] == '~' && array[Y - 1][X] == '~' && array[Y - 2][X] == '~')
                    comprueba = false;
                else
                    comprueba = true;
            } else {
                if (array[Y][X] == '~' && array[Y + 1][X] == '~' && array[Y + 2][X] == '~')
                    comprueba = false;
                else
                    comprueba = true;
            }
        } else if (barco == 2) {
            if (Y + barco > 10) {
                if (array[Y][X] == '~' && array[Y - 1][X] == '~')
                    comprueba = false;
                else
                    comprueba = true;
            } else {
                if (array[Y][X] == '~' && array[Y + 1][X] == '~')
                    comprueba = false;
                else
                    comprueba = true;
            }
        }
        return comprueba;
    }

    /**
     * Toma las coordenadas de Y
     *
     * @return Da la posicion de Y
     */
    public static int posY() {
        Scanner sc = new Scanner(System.in);
        int Y;
        do {
            System.out.println("Dime una coordenada entre el 0-9: ");
            Y = sc.nextInt();
            if (Y < 11 && Y >= 0) {
                Y = Y-1;
            } else {
                System.out.println("ERROR!! La coordenada que has puesto esta mal!");
            }
        } while (Y > 10 || Y < 0);
        return Y;
    }

    /**
     * Toma las coordenadas de X
     *
     * @return Da la posicion de X
     */
    public static int posX() {
        Scanner sc = new Scanner(System.in);
        int X;
        do {
            System.out.println("Dime una coordenada entre la A-J: ");
            X = sc.nextInt();
            if (X < 11 && X >= 0) {
                X = X;
            } else {
                System.out.println("ERROR!! La coordenada que has puesto esta mal!");
            }
        } while (X > 10 || X < 0);
        return X;
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
