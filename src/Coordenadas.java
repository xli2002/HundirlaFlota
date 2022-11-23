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
            Y = Tools.getInteger("Dime una coordenada entre el 0-9: ");
            if (Y < 11 && Y >= 0) {
                Y = Y;
            } else {
                System.out.println("ERROR!! La coordenada que has puesto esta mal!");
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
            System.out.print("Dime una coordenada entre la A-J: ");
            X = sc.next().charAt(0);
            X -= 'A';

            if (X < 11 && X >= 0) {
                X = X;
            } else {
                System.out.println("ERROR!! La coordenada que has puesto esta mal!");
            }
        } while (X > 10 || X < 0);
        return X + 1;
    }

}
