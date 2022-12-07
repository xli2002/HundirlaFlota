public class Posicionar {
    /**
     * Pone la posicion de los barcos del jugador
     *
     * @param barco devuelve los barcos
     * @param array el lugar donde barco se a posicionado
     */
    public static void posicionJugador(int barco, char[][] array) {
        int Y = Coordenadas.posY();
        int X = Coordenadas.posX();

        if (barco != 1) {
            int horizontal = Tools.getInteger("How do you want the boat Horizontally(0) or Vertically(1)? [Default vertically]");

            if (horizontal == 0) {
                if (X + barco > 10) {
                    if (!Comprueba.compruebaX(array, Y, X, barco))
                        for (int i = 0; i < barco; i++) {
                            array[Y][X - i] = 'B';
                        }
                    else {
                        System.out.println("ERROR!! You can't put the boat there !!");
                        posicionJugador(barco, array);
                    }
                } else {
                    if (!Comprueba.compruebaX(array, Y, X, barco))
                        for (int i = 0; i < barco; i++) {
                            array[Y][X + i] = 'B';
                        }
                    else {
                        System.out.println("ERROR!! You can't put the boat there !!");
                        posicionJugador(barco, array);
                    }
                }

            } else {
                if (Y + barco > 10) {
                    if (!Comprueba.compruebaY(array, Y, X, barco))
                        for (int i = 0; i < barco; i++) {
                            array[Y - i][X] = 'B';
                        }
                    else {
                        System.out.println("ERROR!! You can't put the boat there !!");
                        posicionJugador(barco, array);
                    }
                } else {
                    if (!Comprueba.compruebaY(array, Y, X, barco))
                        for (int i = 0; i < barco; i++) {
                            array[Y + i][X] = 'B';
                        }
                    else {
                        System.out.println("ERROR!! You can't put the boat there !!");
                        posicionJugador(barco, array);
                    }
                }
            }
        } else {
            if (array[Y][X] == '~') {
                array[Y][X] = 'B';
            } else {
                System.out.println("ERROR!! You can't put the boat there !!");
                posicionJugador(barco, array);
            }
        }
    }

    /**
     * Pone la posicion de los barcos del PC
     *
     * @param barco devuelve los barcos
     * @param array el lugar donde barco se a posicionado
     */
    public static void posicionPC(int barco, char[][] array) {
        int Y = (int) (Math.random() * 10);
        int X = ((int) (Math.random() * 10)) + 1;
        int horizontal = (int) (Math.random() * 10);

        if (barco != 1) {
            if (horizontal < 5) {
                if (X + barco > 10) {
                    if (!Comprueba.compruebaX(array, Y, X, barco))
                        for (int i = 0; i < barco; i++) {
                            array[Y][X - i] = 'B';
                        }
                    else {
                        System.out.println("ERROR!! You can't put the boat there !!");
                        posicionJugador(barco, array);
                    }
                } else {
                    if (!Comprueba.compruebaX(array, Y, X, barco))
                        for (int i = 0; i < barco; i++) {
                            array[Y][X + i] = 'B';
                        }
                    else {
                        System.out.println("ERROR!! You can't put the boat there !!");
                        posicionJugador(barco, array);
                    }
                }
            } else {
                if (Y + barco > 10) {
                    if (!Comprueba.compruebaY(array, Y, X, barco))
                        for (int i = 0; i < barco; i++) {
                            array[Y - i][X] = 'B';
                        }
                    else {
                        System.out.println("ERROR!! You can't put the boat there !!");
                        posicionJugador(barco, array);
                    }
                } else {
                    if (!Comprueba.compruebaY(array, Y, X, barco))
                        for (int i = 0; i < barco; i++) {
                            array[Y + i][X] = 'B';
                        }
                    else {
                        System.out.println("ERROR!! You can't put the boat there !!");
                        posicionJugador(barco, array);
                    }
                }
            }
        } else {
            if (array[Y][X] == '~') {
                array[Y][X] = 'B';
            } else {
                System.out.println("ERROR!! You can't put the boat there !!");
                posicionJugador(barco, array);
            }
        }
    }
}

