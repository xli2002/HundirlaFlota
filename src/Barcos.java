public class Barcos {


    /**
     * Donde se pongan los barcos
     *
     * @param A      tablero A
     * @param B      tablero B
     * @param C      tablero C
     * @param D      tablero D
     * @param barcos los barcos
     */
    public static void barcos(char[][] A, char[][] B, char[][] C, char[][] D, int barcos[]) {
        for (int i = 0; i < barcos.length; i++) {
            System.out.println("En que coordenada quieres el barco de " + barcos[i] + " ? ");
            Posicionar.posicionJugador(barcos[i], A);
            Posicionar.posicionPC(barcos[i], C);
            Tools.clean();
            Screen.showJugador(A, B);
        }
    }

    /**
     * Cuenta los barcos
     *
     * @param array a ver si hay H
     * @return devuelve num
     */
    public static int numeroBarcos(char[][] array, char letra) {
        int num = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == letra)
                    num++;
            }
        }
        return num-1;
    }

    /**
     * Cantidad de barcos que hay
     *
     * @param array cantidad de barcos
     * @return total de barcos
     */
    public static int misBarcos(int[] array) {
        int barcos = 0;

        for (int i = 0; i < array.length; i++) {
            barcos += array[i];
        }
        return barcos;
    }

}
