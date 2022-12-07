public class Comprueba {
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
        } else {
            comprueba = true;
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
                if (array[Y][X] == '~' && array[Y + 1][X] == '~') {
                    comprueba = false;
                } else
                    comprueba = true;
            }
        }
        return comprueba;
    }

}
