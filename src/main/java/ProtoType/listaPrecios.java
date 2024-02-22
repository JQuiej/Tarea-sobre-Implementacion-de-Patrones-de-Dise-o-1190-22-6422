package ProtoType;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quiej
 */
public class listaPrecios implements Iprototype {

    private String nombre;
    private List<Celulares> listaPrecios = new ArrayList<>();

    public listaPrecios(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Iprototype clone() {
        listaPrecios clone = new listaPrecios(nombre);
        clone.setListaPrecios(listaPrecios);
        return clone;
    }

    @Override
    public Iprototype deepclone() {
        listaPrecios clone = new listaPrecios(nombre);
        List<Celulares> cloneCelulares = new ArrayList();

        for (Celulares celulares : listaPrecios) {
            Celulares cloneCelular = (Celulares) celulares.clone();
            cloneCelulares.add(cloneCelular);
        }
        clone.setListaPrecios(cloneCelulares);
        return clone;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Celulares> getListaPrecios() {
        return listaPrecios;
    }

    public void setListaPrecios(List<Celulares> listaPrecios) {
        this.listaPrecios = listaPrecios;
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this))
                + " - listaPrecios{" + "nombre=" + nombre + ", listaPrecios=" + listaPrecios + '}';
    }

}
