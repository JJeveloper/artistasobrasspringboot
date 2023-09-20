package com.demo.crudartistas.repository;

import com.demo.crudartistas.model.Obra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ObraRepository extends JpaRepository<Obra, Integer> {

    @Query("SELECT o FROM obra o INNER JOIN o.tipodeobra tdo INNER JOIN o.autor a WHERE a.id=:id")
    public List<Obra> findObra(@Param("id") Integer id);

}
