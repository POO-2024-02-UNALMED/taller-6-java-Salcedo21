package vehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vehiculo {
    private static int CantidadVehiculos;
    protected String placa;
    protected int puertas;
    protected int velocidadMaxima;
    protected String nombre;
    protected int precio;
    protected int peso;
    protected String traccion;
    protected Fabricante fabricante;

    public static List<Vehiculo> vehiculos = new ArrayList<>();

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        CantidadVehiculos++;
        vehiculos.add(this);
    }


    public static int getCantidadVehiculos() {
        return CantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidadVehiculos) {
        CantidadVehiculos = cantidadVehiculos;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    static List<Vehiculo> getTodosLosVehiculos() {
        return vehiculos;
    }

    static String vehiculosPorTipo(){
        int cantAuto = Automovil.getCantidadAutomovil();
        int cantCamion= Camion.getCantidadCamion();
        int cantCamioneta = Camioneta.getCantidadCamioneta();
        return   "Automoviles:: " + cantAuto + "\nCamionetas: " + cantCamioneta + "\nCamiones: " + cantCamion;
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
    public static Fabricante fabricaMayorVentas() {
        Map<Fabricante, Integer> fabricanteVentas = new HashMap<>();


        for (Vehiculo vehiculo : getTodosLosVehiculos()) {
            Fabricante fabricante = vehiculo.getFabricante();
            fabricanteVentas.put(fabricante, fabricanteVentas.getOrDefault(fabricante, 0) + 1);
        }


        Fabricante fabricaMayorVenta = null;
        int maxCantidad = 0;

        for (Map.Entry<Fabricante, Integer> entry : fabricanteVentas.entrySet()) {
            if (entry.getValue() > maxCantidad) {
                fabricaMayorVenta = entry.getKey();
                maxCantidad = entry.getValue();
            }
        }

        return fabricaMayorVenta;
    }
    }

