package vehiculos;

public class Camioneta extends Vehiculo{
    private static int cantidadCamioneta;
    private boolean volco;

    public Camioneta(String placa,int puertas,String nombre, int precio,  int peso,Fabricante fabricante, boolean volco){
        super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
        super.setVelocidadMaxima(90);
        super.setTraccion("4X4");
        this.volco = volco;
        cantidadCamioneta++;

    }

    public static int getCantidadCamioneta() {
        return cantidadCamioneta;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
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
