import java.util.Scanner;

public class CalcularNumeroMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de veces a comparar: ");
        int numeroDeVeces = teclado.nextInt();

        if (numeroDeVeces < 10) {
            System.out.println("Error: Debe comparar al menos 10 números enteros!");
        } else {
            int menor = Integer.MAX_VALUE; // asignamos un valor máximo por defecto como numero menor para comenzar
            int numero;

            for (int i = 0; i <numeroDeVeces; i++) {
                System.out.println("Ingrese el numero " + (i + 1) + ": ");
                numero = teclado.nextInt();
                menor = (numero < menor) ? numero : menor;
            }

            System.out.println("El número menor es: " + menor);

            if (menor < 10) {
                System.out.println("El número " + menor + " es menor que 10!");
            } else {
                System.out.println("El número " + menor + " es igual o mayor que 10!");
            }
        }
    }
}
