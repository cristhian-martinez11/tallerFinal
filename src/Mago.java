// Clase hija de Personaje
public class Mago extends Personaje {

    public Mago(int id, String nombre, int nivel) {
        super(id, nombre, nivel); // llama al constructor del padre
    }

    @Override
    public String realizarAccion() {
        return getNombre() + " lanza un hechizo de fuego.";
    }
}