import java.util.Scanner;
public class Tools {

    /**
     * Tiene que devolver si o si un int
     *
     * @param message el mesaje que pondra
     * @return un int
     */
    public static int getInteger(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while (!sc.hasNextInt()) {
            System.out.println("ERROR!! The coordinate you have entered must be a number!");
            sc.next();
        }
        return sc.nextInt();
    }

    /**
     * Limpia la pantalla
     *
     * @clean limpia pantalla
     */
    public static void clean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Pone el nombre del jugador
     *
     * @nombre pone tu nombre
     */
    public static String nombre() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
