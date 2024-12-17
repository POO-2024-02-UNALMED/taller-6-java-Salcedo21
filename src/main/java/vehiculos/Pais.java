package vehiculos;

import java.util.HashMap;
import java.util.Map;
public class Pais {
    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public static Pais paisMasVendedor() {
        Map<Pais, Integer> paisVehiculos = new HashMap<>();

        for (Vehiculo vehiculo : Vehiculo.getTodosLosVehiculos()) {
            Pais pais = vehiculo.getFabricante().getPais();
            paisVehiculos.put(pais, paisVehiculos.getOrDefault(pais, 0) + 1);
        }

        Pais paisMasVendido = null;
        int maxCantidad = 0;

        for (Map.Entry<Pais, Integer> entry : paisVehiculos.entrySet()) {
            if (entry.getValue() > maxCantidad) {
                paisMasVendido = entry.getKey();
                maxCantidad = entry.getValue();
            }
        }

        return paisMasVendido;
    }
}
