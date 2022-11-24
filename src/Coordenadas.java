import java.util.Scanner;

public class Coordenadas {

    /**
     * Toma las coordenadas de Y
     *
     * @return Da la posicion de Y
     */
    public static int posY() {
        Scanner sc = new Scanner(System.in);
        int Y;

        do {
            Y = Tools.getInteger("Give me a coordinate between 0-9: ");
            if (Y < 11 && Y >= 0) {
                Y = Y;
            } else {
                System.out.println("ERROR!! The coordinate you have entered is wrong!");
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
        char X;
        do {
            System.out.print("Give me a coordinate between A-J: ");
            X = sc.next().toUpperCase().charAt(0);
            X -= 'A';

            if (X < 11 && X >= 0) {
                X = X;
            } else {
                System.out.println("ERROR!! The coordinate you have entered is wrong!");
            }
        } while (X > 10 || X < 0);
        return X + 1;
    }

}
