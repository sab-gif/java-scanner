import java.util.Scanner;
public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro
        Scanner scanner = new Scanner(System.in);
        //Los datos que debes pedir al usuario son:
        //1. Nombre

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.println();

        //2. Apellido
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.println();
        //3. Nombre de usuario
        System.out.print("Nombre de usuario: ");
        String usuario = scanner.nextLine();

        System.out.println();
        //4. Contraseña
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        System.out.println();

        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta
        System.out.println("Hola " + nombre + " " + apellido + ", tu nombre de usuario es " + usuario +
                " y tu contraseña es " + contrasena + ", gracias por registrarte.");

        scanner.close();
    }
}