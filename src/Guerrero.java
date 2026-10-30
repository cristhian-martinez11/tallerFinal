// Clase hija de Personaje
public class Guerrero extends Personaje {

    public Guerrero(int id, String nombre, int nivel) {
        super(id, nombre, nivel); // llama al constructor del padre
    }

    @Override
    public String realizarAccion() {
        return getNombre() + " ataca con su espada.";
    }
}