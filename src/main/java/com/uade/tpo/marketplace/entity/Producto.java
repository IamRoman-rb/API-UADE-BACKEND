package com.uade.tpo.marketplace.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class Producto {
    private String id;
    private Date fecha;
    private Timestamp hora;
    private float valor;
    private String descripcion;
    private String foto;
    private int cantidad;
    private int descuento;
    private Categoria categoria;
    private TiposEstados estado;
    private ArrayList<ValorAtributoProducto> datos;
}
