package com.example.mscatalogo.controller;

import com.example.mscatalogo.entity.Catalogo;
import com.example.mscatalogo.service.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CatalogoService catalogoService;
    @GetMapping()
    public ResponseEntity<List<Catalogo>> list(){
        return ResponseEntity.ok().body(catalogoService.listar());
    }
    @PostMapping()
    public ResponseEntity<Catalogo> save(@RequestBody Catalogo catalogo){
        return ResponseEntity.ok(catalogoService.guardar(catalogo));
    }
    @PutMapping()
    public ResponseEntity<Catalogo> update(@RequestBody Catalogo catalogo){
        return ResponseEntity.ok(catalogoService.actualizar(catalogo));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Catalogo> listById(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(catalogoService.listarPorId(id).get());
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id){ catalogoService.eliminarPorId(id);
        return "Eliminado Correctamente :3";
    }
}
