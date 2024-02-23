import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String username = "andres";
        String password = "12345";
        String username2 = "admin";
        String password2 = "12345";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese nombre de usuario: ");
        String usuario = teclado.nextLine();
        System.out.println("Ingrese la contraseña: ");
        String contrasenha = teclado.nextLine();

        boolean isAuth = false;

        if ( (username.equals(usuario) && password.equals(contrasenha)) ||
               (username2.equals(usuario) && password2.equals(contrasenha))){
            isAuth = true;

        } else {
            System.out.println("Usuario o contraseña incorrecto.");
        }

        if (isAuth) {
            System.out.println("Usuario correcto. Bienvenido ".concat(usuario).concat("!"));
        } else {
            System.out.println("Lo siento, requiere autenticación");
        }
    }
}
