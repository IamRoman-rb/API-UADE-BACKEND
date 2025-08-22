package com.uade.tpo.marketplace.entity;

import java.sql.Timestamp;
import java.util.Date;

public class Item {
    private String id;
    private Producto producto;
    private Usuario usuario;
    private int cantidad;
    private float valor;
    private Date fecha;
    private Timestamp hora;
}
