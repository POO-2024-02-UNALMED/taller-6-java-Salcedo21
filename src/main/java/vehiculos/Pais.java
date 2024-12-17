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
    public static String paisMasVendedor() {
        Map<String, Integer> paisVehiculos = new HashMap<>();

        for (Vehiculo vehiculo : Vehiculo.getTodosLosVehiculos()) {
            String pais = vehiculo.getFabricante().getPais().getNombre();
            paisVehiculos.put(pais, paisVehiculos.getOrDefault(pais, 0) + 1);
        }


        String paisMasVendido = null;
        int maxCantidad = 0;

        for (Map.Entry<String, Integer> entry : paisVehiculos.entrySet()) {
            if (entry.getValue() > maxCantidad) {
                paisMasVendido = entry.getKey();
                maxCantidad = entry.getValue();
            }
        }

        return paisMasVendido;
    }
}
