import java.util.Scanner;

public class Tareas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un numero: ");
        int numero1 = teclado.nextInt();
        System.out.println("Introduzca otro numero: ");
        int numero2 = teclado.nextInt();

        /*
        Respuesta alternativa

        String resultado = (numero1 > numero2) ? numero1 + " y " + numero2 : numero2 + " y " + numero1;
        System.out.println("El resultado es: " + resultado);

        */

        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else {
            System.out.println(numero2 + " es mayor que " + numero1);
        }




    }
}
