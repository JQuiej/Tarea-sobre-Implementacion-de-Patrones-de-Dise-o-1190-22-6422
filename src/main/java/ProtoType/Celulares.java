package ProtoType;

/**
 *
 * @author Quiej
 */
public class Celulares implements Iprototype {

    private String nombre;
    private double precio;

    public Celulares(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public Iprototype clone() {
        Celulares clone = new Celulares(this.nombre, this.precio);
        return clone;
    }

    @Override
    public Iprototype deepclone() {
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) + " "
                + "- Celulares{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

}
