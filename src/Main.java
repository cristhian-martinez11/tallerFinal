import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Comprueba las reglas. Si algo falla, muestra el mensaje y devuelve false
    public static boolean datosValidos(int id, String nombre, int nivel) {
        if (id <= 0) {
            System.out.println("Error: el id debe ser mayor que 0.");
            return false;
        }
        if (nombre.trim().isEmpty()) {
            System.out.println("Error: el nombre no puede estar vacío.");
            return false;
        }
        if (nivel < 1 || nivel > 100) {
            System.out.println("Error: el nivel debe estar entre 1 y 100.");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Personaje> personajes = new ArrayList<Personaje>();

        try {
            // Guerrero
            System.out.println("--- Datos del Guerrero ---");
            System.out.print("ID: ");
            int idG = sc.nextInt();
            System.out.print("Nombre: ");
            String nombreG = sc.next();
            System.out.print("Nivel (1 a 100): ");
            int nivelG = sc.nextInt();

            if (!datosValidos(idG, nombreG, nivelG)) {
                return; // termina sin registrar
            }
            personajes.add(new Guerrero(idG, nombreG, nivelG));

            // Mago
            System.out.println("\n--- Datos del Mago ---");
            System.out.print("ID: ");
            int idM = sc.nextInt();
            System.out.print("Nombre: ");
            String nombreM = sc.next();
            System.out.print("Nivel (1 a 100): ");
            int nivelM = sc.nextInt();

            if (!datosValidos(idM, nombreM, nivelM)) {
                return; // termina sin registrar
            }
            personajes.add(new Mago(idM, nombreM, nivelM));

        } catch (InputMismatchException e) {
            System.out.println("Error: debes escribir un número donde se pide un número.");
            return;
        }

        // Polimorfismo: la misma llamada ejecuta la acción de cada subclase
        System.out.println("\n--- Personajes registrados ---");
        for (Personaje p : personajes) {
            p.mostrarInfo();
            System.out.println("Acción: " + p.realizarAccion());
            System.out.println("-----------------------------");
        }
    }
}