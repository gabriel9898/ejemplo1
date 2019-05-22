/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.dao.Iproducto;
import aplicacion.dao.imp.ProductoListDaoImp;
import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class ProductoFormBean implements Serializable{
    private Iproducto productoDAO;
    private Producto producto;
    private List<Producto> productoSeleccionado ;
    
    /**
     * Creates a new instance of ProductoFormBean
     */
    public ProductoFormBean() {
        productoDAO = new ProductoListDaoImp();
        producto = new Producto();
        productoSeleccionado = new ArrayList<>();
        
    }

    public List<Producto> obtener(){
        return productoDAO.obtener();
    }
    public Iproducto getProductoDAO() {
        return productoDAO;
    }

    public void setProductoDAO(Iproducto productoDAO) {
        this.productoDAO = productoDAO;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getProductoSeleccionado() {
        return productoSeleccionado;
    }

    public void setProductoSeleccionado(List<Producto> productoSeleccionado) {
        this.productoSeleccionado = productoSeleccionado;
    }
    
    public Integer obtenerPrecioTotal(){
        return productoDAO.obtenerPrecioTotal(productoSeleccionado);
    }
    
    
}
