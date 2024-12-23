package vehiculos;

import java.util.HashMap;
import java.util.List;
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

    public static Fabricante fabricaMayorVentas() {
        List<Vehiculo> vehiculos = Vehiculo.getTodosLosVehiculos();
        Map<Fabricante, Integer> ventasPorFabricante = new HashMap<>();

        for (Vehiculo vehiculo : vehiculos) {
            Fabricante fabricante = vehiculo.getFabricante();
            ventasPorFabricante.put(fabricante, ventasPorFabricante.getOrDefault(fabricante, 0) + 1);
        }

        Fabricante mayorFabricante = null;
        int maxVentas = 0;

        for (Map.Entry<Fabricante, Integer> entry : ventasPorFabricante.entrySet()) {
            if (entry.getValue() > maxVentas) {
                mayorFabricante = entry.getKey();
                maxVentas = entry.getValue();
            }
        }

        return mayorFabricante;
    }
}