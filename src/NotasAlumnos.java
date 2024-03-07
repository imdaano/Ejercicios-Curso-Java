import java.sql.SQLOutput;
import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        System.out.println("Introduce las notas en escala del 1 al 7: ");
        double[] notasAlumnos = new double[20];
        Scanner teclado = new Scanner(System.in);
        int mayoresDe5 = 0;
        double sumaMayor5 = 0;
        int menoresDe4 = 0;
        int sumaMenor4 = 0;
        int notasDe1 = 0;

        for (int i = 0; i < notasAlumnos.length;i++){
            System.out.print("Introduzca la nota nº" + (i + 1) + " : ");
            notasAlumnos[i] = teclado.nextDouble();
            if (notasAlumnos[i] == 0) {
                System.out.println("La nota no puede ser 0");
                break;
            } else if (notasAlumnos[i] == 1) {
                notasDe1++;
            } else if ( notasAlumnos[i] < 5 ) {
                menoresDe4++;
                sumaMenor4 += notasAlumnos[i];
            } else if ( notasAlumnos[i] >=5 && notasAlumnos[i] <= 7) {
                mayoresDe5++;
                sumaMayor5 += notasAlumnos[i];
            } else {
                System.out.println("Introduce una nota correcta.");
                break;
            }
        }

        System.out.println("notasAlumnos = " + notasAlumnos.toString());
        System.out.println("notasDe1 = " + notasDe1);
        System.out.println("menoresDe4 = " + menoresDe4);
        System.out.println("mayoresDe5 = " + mayoresDe5);
        System.out.println("promedio menor de 4 = " + sumaMenor4 / menoresDe4);
        System.out.println("promedio mayor de 5 = " + sumaMayor5 / mayoresDe5);



    }
}
