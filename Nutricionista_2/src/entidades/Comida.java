
package entidades;


public class Comida {
    private String nombre;
    private String detalle;
    private int cantCalorias;
    private int idComida;

    public Comida() {
    }

    public Comida(String nombre, String detalle, int cantCalorias, int idComida) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantCalorias = cantCalorias;
        this.idComida = idComida;
    }

    public Comida(String nombre, String detalle, int cantCalorias) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantCalorias = cantCalorias;
    }

    public String getNombre() {
        return nombre;
    }

    public Comida(String nombre, int idComida) {
        this.nombre = nombre;
        this.idComida = idComida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    @Override
    public String toString() {
        return "Comida{" + "nombre=" + nombre + ", detalle=" + detalle + ", cantCalorias=" + cantCalorias + ", idComida=" + idComida + '}';
    }

  
    
}
