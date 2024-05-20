package com.example.mscatalogo.service.impl;
import com.example.mscatalogo.entity.Catalogo;
import com.example.mscatalogo.repository.CatalogoRepository;
import com.example.mscatalogo.service.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CatalogoServiceimpl implements CatalogoService {
    @Autowired
    private CatalogoRepository catalogoRepository;
    @Override
    public List<Catalogo> listar(){
        return catalogoRepository.findAll();
    }
    @Override
    public Catalogo guardar(Catalogo catalogo) {
        return catalogoRepository.save(catalogo);
    }
    @Override
    public Catalogo actualizar(Catalogo catalogo) {
        return catalogoRepository.save(catalogo);
    }
    @Override
    public Optional<Catalogo> listarPorId(Integer id){
        return catalogoRepository.findById(id);
    }
    @Override
    public void eliminarPorId(Integer id) {
        catalogoRepository.deleteById(id);
    }
}
