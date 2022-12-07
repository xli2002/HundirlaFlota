public class Screen {
    /**
     * Muestra en pantalla el tablero del jugador
     *
     * @param arrayD Muestra los tableros de los Disparos
     * @param arrayP Muestra los tableros de las Posiciones
     */
    public static void showJugador(char[][] arrayD, char[][] arrayP) {
        Tools.clean();
        System.out.println("\t YOUR TABLE \t\t\t YOUR SHOTS");
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
        Tools.clean();
        System.out.println("\t PC TABLE \t\t\t\t PC SHOTS");
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
}

