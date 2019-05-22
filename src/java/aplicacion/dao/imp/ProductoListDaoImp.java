/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.Iproducto;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.util.ListProducto;
import java.io.Serializable;
import java.util.List;


public class ProductoListDaoImp implements Serializable, Iproducto{
    private ListProducto listProducto;

    public ProductoListDaoImp() {
        listProducto =  new ListProducto();
    }

    @Override
    public List<Producto> obtener() {
        return listProducto.getListProducto();
    }

    @Override
    public Integer obtenerPrecioTotal(List<Producto> listaProducto) {
        return listProducto.obtenerPrecioTotal(listaProducto);
    }
}
