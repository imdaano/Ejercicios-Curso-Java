import java.util.Scanner;

public class TanqueGasolina {
    public static void main(String[] args) {
      /*
        Si la capacidad actual es 70 litros: imprimir Estanque lleno

        Si está entre 60 y menor a 70: imprimir Estanque casi lleno

        Si está entre 40 y menor a 60: imprimir Estanque  3/4

        Si está entre 35 y menor a 40: imprimir Medio Estanque

        Si está entre 20 y menor a 35: imprimir Suficiente

        Si está entre 1 y menor a 20: imprimir Insuficiente
      */
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce la cantidad actual del tanque: ");
            double tanqueLleno = teclado.nextDouble();

            if (tanqueLleno == 0){
                System.out.println("Opción no válida.");
            } else if (tanqueLleno < 20) {
                System.out.println("Insuficiente");
            } else if (tanqueLleno < 35) {
                System.out.println("Suficiente");
            } else if (tanqueLleno < 40) {
                System.out.println("Medio Estanque");
            } else if (tanqueLleno < 60 ) {
                System.out.println("Estanque 3/4");
            } else if (tanqueLleno < 70) {
                System.out.println("Estanque casi lleno");
            } else if (tanqueLleno == 70) {
                System.out.println("Estanque lleno");
            } else {
                System.out.println("Opción no válida. Tanque al máximo.");
            }
        } while (true);


    }
}
