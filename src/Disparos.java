public class Disparos {

    /**
     * Dispara el jugador
     *
     * @param B devuelve el tablero B
     * @param C devuelve el tablero C
     */
    public static void disparo(char[][] B, char[][] C) {
        int Y = Coordenadas.posY();
        int X = Coordenadas.posX();

        if (C[Y][X] == 'B' || C[Y][X] == 'H') {
            System.out.println("HIT!");
            B[Y][X] = 'H';
            C[Y][X] = 'H';
        } else {
            System.out.println("WATER!");
            B[Y][X] = 'A';
            C[Y][X] = 'A';
        }
    }

    /**
     * Dispara el PC
     *
     * @param A devuelve el tablero A
     * @param D devuelve el tablero D
     */
    public static void disparoPC(char[][] A, char[][] D) {
        int Y = (int) (Math.random() * 10);
        int X = (int) (Math.random() * 10);
        X = X + 1;

        if (A[Y][X] == 'B' || A[Y][X] == 'H') {
            A[Y][X] = 'H';
            D[Y][X] = 'H';
        } else {
            D[Y][X] = 'A';
            A[Y][X] = 'A';
        }
    }


}
