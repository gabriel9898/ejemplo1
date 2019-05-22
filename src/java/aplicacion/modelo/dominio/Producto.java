/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;


public class Producto implements Serializable{
    private String pro_codigo;
    private String pro_nombre;
    private String pro_marca;
    private String pro_tipo;
    private Integer pro_precio;

    public Producto(String pro_codigo, String pro_nombre, String pro_marca, String pro_tipo, Integer pro_precio) {
        this.pro_codigo = pro_codigo;
        this.pro_nombre = pro_nombre;
        this.pro_marca = pro_marca;
        this.pro_tipo = pro_tipo;
        this.pro_precio = pro_precio;
    }

    public Producto() {
    }

    
    @Override
    public String toString() {
        return "Producto{" + "pro_codigo=" + pro_codigo + ", pro_nombre=" + pro_nombre + ", pro_marca=" + pro_marca + ", pro_tipo=" + pro_tipo + ", pro_precio=" + pro_precio + '}';
    }

    public String getPro_codigo() {
        return pro_codigo;
    }

    public void setPro_codigo(String pro_codigo) {
        this.pro_codigo = pro_codigo;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public String getPro_marca() {
        return pro_marca;
    }

    public void setPro_marca(String pro_marca) {
        this.pro_marca = pro_marca;
    }

    public String getPro_tipo() {
        return pro_tipo;
    }

    public void setPro_tipo(String pro_tipo) {
        this.pro_tipo = pro_tipo;
    }

    public Integer getPro_precio() {
        return pro_precio;
    }

    public void setPro_precio(Integer pro_precio) {
        this.pro_precio = pro_precio;
    }
    
    
}
