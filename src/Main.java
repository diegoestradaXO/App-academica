import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Boolean deseaContinuar = true;
        Nivel nivel = new Nivel();
        do {
            System.out.println("Hola, Que deseas hacer?\n" +
                    "1. Ingresar nivel academico\n" +
                    "2. Ingresar grado\n" +
                    "3. Ingresar estudiante\n" +
                    "4. Salir");
            int contador1 = 0;
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            switch (option){
                case 1:
                    System.out.println("Ingrese el nombre del nivel: ");
                    Scanner nombre = new Scanner(System.in);
                    contador1 += 1;
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    deseaContinuar = false;
                    break;

            }

        } while (deseaContinuar);
    }

}
