package vehiculos;

public class Automovil extends Vehiculo{
    private static int cantidadAutomovil;
    private int puestos;

    Automovil(String placa,int puertas,String nombre, int precio,  int peso,Fabricante fabricante, int puestos){
        super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
        this.puestos=puestos;
        cantidadAutomovil++;
    }

    public static int getCantidadAutomovil() {
        return cantidadAutomovil;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public Fabricante getFabricante() {
        return super.getFabricante();
    }

    public void setFabricante(Fabricante fabricante) {
        super.setFabricante(fabricante);
    }

    public String getNombre() {
        return super.getNombre();
    }

    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public int getPeso() {
        return super.getPeso();
    }

    public void setPeso(int peso) {
        super.setPeso(peso);
    }

    public String getPlaca() {
        return super.getPlaca();
    }

    public void setPlaca(String placa) {
        super.setPlaca(placa);
    }

    public int getPrecio() {
        return super.getPrecio();
    }

    public void setPrecio(int precio) {
        super.setPrecio(precio);
    }

    public int getPuertas() {
        return super.getPuertas();
    }

    public void setPuertas(int puertas) {
        super.setPuertas(puertas);
    }

    public String getTraccion() {
        return super.getTraccion();
    }

    public void setTraccion(String traccion) {
        super.setTraccion(traccion);
    }

    public int getVelocidadMaxima() {
        return super.getVelocidadMaxima();
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        super.setVelocidadMaxima(velocidadMaxima);
    }
}
