public class HundirFlota {
    public static void main(String[] args) {

        char[][] tableroA = new char[11][11];
        char[][] tableroB = new char[11][11];
        char[][] tableroC = new char[11][11];
        char[][] tableroD = new char[11][11];
        int[] barcos = {1};
        boolean end = false, theend = false;
        int cant = 0, n = Barcos.misBarcos(barcos);

        Tablero.crearTablero(tableroA);
        Tablero.crearTablero(tableroB);
        Tablero.crearTablero(tableroC);
        Tablero.crearTablero(tableroD);

        System.out.println("Tell me your name: ");
        String nombre = Tools.nombre();
        Screen.showJugador(tableroA, tableroB);
        Barcos.barcos(tableroA, tableroB, tableroC, tableroD, barcos);
//        showPC(tableroC, tableroD);
        System.out.println("Game started!!");

        do {
            Screen.showPC(tableroC, tableroD);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            Tools.clean();
            Screen.showJugador(tableroA, tableroB);
            System.out.println("You have " + Barcos.numeroBarcos(tableroB, 'H') + " of " + n
                    + " and PC has " + Barcos.numeroBarcos(tableroC, 'B')
                    + " boats and you have " + cant + " of shoot.");

            System.out.println("It's your turn!!");
            Disparos.disparo(tableroB, tableroC);

            if (Barcos.numeroBarcos(tableroB, 'H') == n) {
                end = true;
            }
            cant++;

            Disparos.disparoPC(tableroA, tableroD);
            if (Barcos.numeroBarcos(tableroD, 'H') == n) {
                theend = true;
            }

        } while (!end && !theend);

        Screen.showPC(tableroC, tableroD);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        Tools.clean();
        Screen.showJugador(tableroA, tableroB);
        Tools.clean();
        System.out.println("GG");
        if (end) {
            System.out.println("YOU WON " + nombre);
        } else {
            System.out.println("YOU LOST " + nombre);
        }
    }
}
