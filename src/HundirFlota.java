import java.util.Scanner;

public class HundirFlota {
    public static void main(String[] args) {

        char[][] tableroA = new char[11][11];
        char[][] tableroB = new char[11][11];
        char[][] tableroC = new char[11][11];
        char[][] tableroD = new char[11][11];
        int[] barcos = {5, 4};
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
            Tools.clean();
            Screen.showJugador(tableroA, tableroB);
            System.out.println("Tienes " + Barcos.numeroBarcos(tableroA, 'B') + cant
                    + " barcos " + Barcos.numeroBarcos(tableroC, 'B')
                    + " barcos de PC y llevas " + cant + " de disparos.");

            System.out.println("Te toca a ti disparar");
            Screen.showPC(tableroC,tableroD);
            Disparos.disparo(tableroB, tableroC);
            if (Barcos.numeroBarcos(tableroB, 'H') == n) ;
            end = true;
            cant++;
            if (cant == (n + 5))
                ready = false;
            Disparos.disparoPC(tableroA, tableroD);
            if (Barcos.numeroBarcos(tableroD, 'H') == n)
                theend = true;
        } while (end == false || theend == false || ready == true);


        Tools.clean();
        System.out.println("GG");
        if (end)
            System.out.println("VICTORY");
        else
            System.out.println("DEFEAT");

    }
}
