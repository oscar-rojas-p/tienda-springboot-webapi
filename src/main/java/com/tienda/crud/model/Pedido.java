package com.tienda.crud.model;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document(collection = "pedidos")
public class Pedido {
    @Id
    private String id;
    private String codCliente;
    private List<Producto> productos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public static class Producto implements Serializable {
        private int codProducto;
        private double precio;
        private int cantidad;

        public int getCodProducto() {
            return codProducto;
        }

        public void setCodProducto(int codProducto) {
            this.codProducto = codProducto;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }
    }
}

