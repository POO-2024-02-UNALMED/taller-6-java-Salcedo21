package vehiculos;

public class Fabricante {
    private String nombre;
    private Pais pais;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public Pais getPais() {
        return pais;
    }
}