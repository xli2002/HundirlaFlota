import java.util.Scanner;

public class HundirFlota {
    public static void main(String[] args) {

        char[][] tableroA = new char[11][11];
        char[][] tableroB = new char[11][11];
        char[][] tableroC = new char[11][11];
        char[][] tableroD = new char[11][11];
        int[] barcos = {5,4,3,3,2};
        boolean ready = true, end = false, theend = false;
        int cant = 0, n = Barcos.misBarcos(barcos);

        Tablero.crearTablero(tableroA);
        Tablero.crearTablero(tableroB);
        Tablero.crearTablero(tableroC);
        Tablero.crearTablero(tableroD);

        Tools.nombre();
        Screen.showJugador(tableroA, tableroB);
        Barcos.barcos(tableroA, tableroB, tableroC, tableroD, barcos);
//        showPC(tableroC, tableroD);
        System.out.println("Empieza el juego!!");


        do {
            Screen.showPC(tableroC, tableroD);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            Tools.clean();
            Screen.showJugador(tableroA, tableroB);
            System.out.println("Tienes " + Barcos.numeroBarcos(tableroB, 'H') + " de " + n
                    + " y PC tiene " + Barcos.numeroBarcos(tableroC, 'B')
                    + " barcos y llevas " + cant + " de disparos.");

            System.out.println("Te toca a ti disparar");
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


        Tools.clean();
        System.out.println("GG");
        if (end == true) {
            System.out.println("VICTORY");
        } else {
            System.out.println("DEFEAT");
        }
    }
}
