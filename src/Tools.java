import java.util.Scanner;

public class Tools {
    public static int getInteger(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while(!sc.hasNextInt()){
            System.out.println("ERROR!! La coordenada que has puesto debe ser un numero!");
            sc.next();
        }
        return sc.nextInt();
    }
}
