package com.demo.crudartistas.service;

import com.demo.crudartistas.model.Obra;
import com.demo.crudartistas.repository.ObraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ObraSevice {

    @Autowired
    ObraRepository obraRepository;

    public ArrayList<Obra> getObra(){
        return (ArrayList<Obra>) obraRepository;
    }

    public Obra saveObra(Obra obra){
        return obraRepository.save(obra);
    }

    public Optional<Obra> getById(Integer id){
        return obraRepository.findById(id);
    }

    public Obra updateById(Obra request, Integer id){
        Obra obra = obraRepository.findById(id).get();
        obra.setNombre(request.getNombre());
        obra.setAutor(request.getAutor());
        obra.setTipoObra(request.getTipoObra());
        obra.setComentario(request.getComentario());
        obraRepository.save(obra);
        return obra;
    }

    public Boolean deleteById(Integer id){
        try {
            obraRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
