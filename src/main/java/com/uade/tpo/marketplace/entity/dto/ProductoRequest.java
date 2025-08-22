package com.uade.tpo.marketplace.entity.dto;

import com.uade.tpo.marketplace.entity.Categoria;
import com.uade.tpo.marketplace.entity.ValorAtributoProducto;
import com.uade.tpo.marketplace.enums.Estados;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class ProductoRequest {
    private String id;
    private Date fecha;
    private Timestamp hora;
    private float valor;
    private String descripcion;
    private String foto;
    private int cantidad;
    private int descuento;
    private Categoria categoria;
    private Estados estado;
    private ArrayList<ValorAtributoProducto> datos;
}
