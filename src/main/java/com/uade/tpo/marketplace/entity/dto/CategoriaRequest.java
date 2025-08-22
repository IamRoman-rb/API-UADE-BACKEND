package com.uade.tpo.marketplace.entity.dto;

import com.uade.tpo.marketplace.enums.Categorias;
import com.uade.tpo.marketplace.enums.Estados;

public class CategoriaRequest {
    private String id;
    private String nombre;
    private String descripcion;
    private Categorias categoria;
    private Estados estado;
}
