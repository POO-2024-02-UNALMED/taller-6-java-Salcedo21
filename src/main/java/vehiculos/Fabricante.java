package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Fabricante {
    private String nombre;
    private Pais pais;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static String fabricaMayorVentas() {
        Map<String, Integer> fabricanteVentas = new HashMap<>();


        for (Vehiculo vehiculo : Vehiculo.getTodosLosVehiculos()) {
            String fabricante = vehiculo.getFabricante().getNombre();
            fabricanteVentas.put(fabricante, fabricanteVentas.getOrDefault(fabricante, 0) + 1);
        }


        String fabricanteMayorVentas = null;
        int maxCantidad = 0;

        for (Map.Entry<String, Integer> entry : fabricanteVentas.entrySet()) {
            if (entry.getValue() > maxCantidad) {
                fabricanteMayorVentas = entry.getKey();
                maxCantidad = entry.getValue();
            }
        }

        return fabricanteMayorVentas;
    }
}