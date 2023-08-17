package com.demo.crudartistas.service;

import com.demo.crudartistas.model.Autor;
import com.demo.crudartistas.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    AutorRepository autorRepository;

    public ArrayList<Autor> getAutor(){
        return (ArrayList<Autor>) autorRepository.findAll();
    }

    public Autor saveAutor(Autor autor){
        return autorRepository.save(autor);
    }

    public Optional<Autor> getById(Integer id){
        return autorRepository.findById(id);
    }

    public Autor updateById(Autor request, Integer id){
        Autor autor = autorRepository.findById(id).get();
        autor.setNombres(request.getNombres());
        autor.setNacimiento(request.getNacimiento());
        autor.setOcupaciones(request.getOcupaciones());
        autor.setFallecimiento(request.getFallecimiento());
        autorRepository.save(autor);
        return autor;
    }

    public Boolean deleteById(Integer id){
        try{
            autorRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
