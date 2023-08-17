package com.demo.crudartistas.service;

import com.demo.crudartistas.model.TipoObra;
import com.demo.crudartistas.repository.TipoObraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Service
public class TipoObraService {

    @Autowired
    TipoObraRepository tipoObraRepository;

    public ArrayList<TipoObra> getTipoObra(){
        return (ArrayList<TipoObra>) tipoObraRepository.findAll();
    }

    public TipoObra saveTipoObra(TipoObra tipoObra){
        return tipoObraRepository.save(tipoObra);
    }

    public Optional<TipoObra> getById(Integer id){
        return tipoObraRepository.findById(id);
    }

    public TipoObra updateByID(TipoObra request, Integer id){
        TipoObra tipoObra = tipoObraRepository.findById(id).get();
        tipoObra.setTipodeobra(request.getTipodeobra());
        tipoObraRepository.save(tipoObra);
        return tipoObra;
    }

    public Boolean deleteById(Integer id){
        try {
            tipoObraRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
