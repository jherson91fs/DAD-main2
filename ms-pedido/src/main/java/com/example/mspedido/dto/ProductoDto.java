package com.example.mspedido.dto;

import lombok.Data;

@Data
public class ProductoDto {
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
    private CategoriaDto categoriaDto;
}
