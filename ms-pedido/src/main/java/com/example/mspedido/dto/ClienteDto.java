package com.example.mspedido.dto;

import lombok.Data;

@Data
public class ClienteDto {

        private Integer id;
        private String nombre;
        private String apellidos;
        private String dni;
        private String email;
        private String telefono;
        private String dirección;

}
