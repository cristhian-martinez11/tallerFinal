// Clase padre: datos comunes de todos los personajes
public class Personaje {

    // Atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private int nivel;

    // Constructor: inicializa los tres atributos
    public Personaje(int id, String nombre, int nivel) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
    }

    // Getter que necesitan las hijas para usar el nombre
    public String getNombre() {
        return nombre;
    }

    // Imprime los datos del personaje
    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
    }

    // Mensaje general: las hijas lo sobrescriben
    public String realizarAccion() {
        return nombre + " realiza una acción.";
    }
}