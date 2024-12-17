package vehiculos;

public class Camion extends Vehiculo{
    private static int cantidadCamion;
    private int ejes;

    Camion(String placa,String nombre, int precio,  int peso,Fabricante fabricante,int ejes){
        super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
        this.ejes= ejes;
        cantidadCamion++;
    }

    public static int getCantidadCamion() {
        return cantidadCamion;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
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
