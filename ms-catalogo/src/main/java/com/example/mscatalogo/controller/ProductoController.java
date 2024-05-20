package com.example.mscatalogo.controller;

import com.example.mscatalogo.entity.Catalogo;
import com.example.mscatalogo.entity.Producto;
import com.example.mscatalogo.service.CatalogoService;
import com.example.mscatalogo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping()
    public ResponseEntity<List<Producto>> list() {
        return ResponseEntity.ok().body(productoService.listar());
    }

    @PostMapping()
    public ResponseEntity<Producto> guardar(@RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.guardar(producto));
    }

    @PutMapping()
    public ResponseEntity<Producto> actualizar(@RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.actualizar(producto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> listarPorId(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(productoService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String eliminarPorId(@PathVariable(required = true) Integer id) {
        productoService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
