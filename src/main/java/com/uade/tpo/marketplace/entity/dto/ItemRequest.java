package com.uade.tpo.marketplace.entity.dto;

import com.uade.tpo.marketplace.entity.Producto;
import com.uade.tpo.marketplace.entity.Usuario;

import java.sql.Timestamp;
import java.util.Date;

public class ItemRequest {
    private String id;
    private Producto producto;
    private Usuario usuario;
    private int cantidad;
    private float valor;
    private Date fecha;
    private Timestamp hora;
}
