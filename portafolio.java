import java.util.Scanner;
public class portafolio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("");
            System.out.println("Bienvenidos a mi memes java [memes versión 1.0]");

            System.out.println("_ __ ___   ___ _ __ ___   ___  ___ ");
            System.out.println("| '_ ` _ \\ / _ \\ '_ ` _ \\ / _ \\/ __|");
            System.out.println("| | | | | |  __/ | | | | |  __/\\__ \\");
            System.out.println("|_| |_| |_|\\___|_| |_| |_|\\___||___/");
            System.out.println("");

            System.out.println("[?] selecciona una opcion para continuar");
            System.out.println("Proyecto Iniciado -----> mar 18 8:48 am 2025");
            System.out.println("");

            System.out.println("+---------------------+");
            System.out.println("[1]. Suma de dos números");
            System.out.println("[2]. Opcion-1");
            System.out.println("[3]. Opcion-2");
            System.out.println("[4]. Opcion-3");
            System.out.println("[5]. Salir");
            System.out.print("selecciona una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer numero: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    int num2 = scanner.nextInt();
                    int suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    System.out.println("Opcion-2");
                    break;
                case 3:
                    System.out.println("Opcion-3");
                    break;
                case 4:
                    System.out.println("Opcion-4");
                    break;
                case 5:
                    System.out.println("Saliendo del programa!!!");

                    return;
            }
            System.out.println();
        }
    }
}