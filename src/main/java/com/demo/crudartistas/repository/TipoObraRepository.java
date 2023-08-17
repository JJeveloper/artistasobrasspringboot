package com.demo.crudartistas.repository;

import com.demo.crudartistas.model.TipoObra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoObraRepository extends JpaRepository<TipoObra, Integer> {
}
