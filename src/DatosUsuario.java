import java.util.Scanner;
import utilidades.ProcesadorTexto;
import utilidades.Usuario;
 
public class DatosUsuario {
   //main method, It is where Java starts running the program
    public static void main(String[] args) {
        //create a Scanner object called sc and listen to the user
        Scanner sc = new Scanner(System.in);
 
        // ask for name and save it under nombre variable
        System.out.println("Escribe tu nombre: ");
        String nombre = sc.nextLine();
// ask for age and save it under edad variable as an integar
        System.out.println("Escribe tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // What Professor said in class
 
        System.out.println("Escribe tu email: ");
        String email = sc.nextLine();
 
        // Call a method esEmailValido (from class ProcesadorTexto).
        // Result is true/false and stored in emailValido.
        boolean emailValido = ProcesadorTexto.esEmailValido(email);
 
        if (emailValido) {
            //Create a new Usuario object with the data you typed (name, age, email).
           Usuario usuario = new Usuario(nombre, edad , email);
           // call mostrarinformation method from user class and show the user information
            usuario.mostrarInformacion();
        } else {
            System.out.println("El usuario no puede ser creado porque el email introducido no es valido");
        }
 
        // check the age and see if user can drive or not
        if (edad > 18) {
            System.out.println("Tienes edad para conducir");
        } else {
            System.out.println("No tienes edad para conducir");
        }
 
        sc.close();
    }
}
 
 