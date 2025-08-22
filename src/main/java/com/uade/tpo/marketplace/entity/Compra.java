package com.uade.tpo.marketplace.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class Compra {
    private String id;
    private float valor;
    private Usuario usuario;
    private ArrayList<Item> items;
    private Date fecha;
    private Timestamp hora;
}
