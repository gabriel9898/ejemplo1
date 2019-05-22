/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ListProducto implements Serializable{
    private List<Producto> listProducto;

    public ListProducto() {
        listProducto = new ArrayList<>();
        
        listProducto.add(new Producto("1", "computadora", "dell", "electrodomestico", 20000));
        listProducto.add(new Producto("2", "lavarropa", "drean", "electrodomestico", 15000));
        listProducto.add(new Producto("3", "heladera", "atma", "electrodomestico", 23000));
        listProducto.add(new Producto("4", "bicicleta", "renzo", "rodado", 12000));
        listProducto.add(new Producto("5", "celular", "asus", "telefono", 28000));
        
    }

    public Integer obtenerPrecioTotal(List<Producto> listaProducto){
        Integer Total = 0;
        for (Producto p:listaProducto){
            Total += p.getPro_precio();
        }
        return Total;
    }
    
    public List<Producto> getListProducto() {
        return listProducto;
    }

    public void setListProducto(List<Producto> listProducto) {
        this.listProducto = listProducto;
    }
    
    
    
    
}
