package com.example.mscatalogo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fechaVenta;
    private int cantidadProductos;
    private String metodoPago;
    private String nombreCliente;
    private String direccionCliente;
    private String correoCliente;
    private String telefonoCliente;
    private String productoVendido;
    private double precioProducto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Catalogo catalogo;
}
