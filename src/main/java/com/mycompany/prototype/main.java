package com.mycompany.prototype;

import ProtoType.Celulares;
import ProtoType.listaPrecios;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quiej
 */
public class main {

    public static void main(String[] args) {
        listaPrecios precios = new listaPrecios("Precios Smartphones");
        List<Celulares> listaCelulares = new ArrayList<>();
        listaCelulares.add(new Celulares("Honor Magic 5Lite", 2599));
        listaCelulares.add(new Celulares("Honor 90", 3700));
        listaCelulares.add(new Celulares("Samsung S24 Ultra", 12999));
        listaCelulares.add(new Celulares("Iphone 15 Pro 128GB", 11999));

        precios.setListaPrecios(listaCelulares);
        //imprimimos en consola la lista ingresada
        System.out.println(precios);

        //segunda lista con rebajas
        listaPrecios listaPreciosOff = (listaPrecios) precios.clone();
        listaPreciosOff.setNombre("Smartphones en descuento");

        //por cada iteracion le descontamos 10% a cada precio
        for (Celulares celulares : listaPreciosOff.getListaPrecios()) {
            celulares.setPrecio(celulares.getPrecio() * 0.90);
        }
        //imprimimos en consola la nueva lista con rebajas
        System.out.println(listaPreciosOff);

    }
}
