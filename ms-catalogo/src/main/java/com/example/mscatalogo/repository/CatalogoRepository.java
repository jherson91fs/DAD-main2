package com.example.mscatalogo.repository;

import com.example.mscatalogo.entity.Catalogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogoRepository extends JpaRepository<Catalogo, Integer> {
}
