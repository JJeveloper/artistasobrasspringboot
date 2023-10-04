package com.demo.crudartistas.controller;

import com.demo.crudartistas.model.Obra;
import com.demo.crudartistas.model.TipoObra;
import com.demo.crudartistas.service.ObraSevice;
import com.demo.crudartistas.service.TipoObraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ObraController {

    @Autowired
    ObraSevice obraSevice;

    @Autowired
    TipoObraService tipoObraService;

    @PostMapping("/createobra")
    public String guardarObra(@ModelAttribute("obr")  Obra obra){
        obraSevice.saveObra(obra);
        return "redirect:/tableartista";
    }

    @PostMapping("/editobra")
    public String editarObra(Model model,Obra obra){
        obraSevice.saveObra(obra);
        List<Obra> obraudt = obraSevice.getObraIdAutor(obra.getAutor().getId());
        model.addAttribute("tableobra", obraudt);
        return "verobras";
    }

    @GetMapping("/tableverobra/{id}")
    public String tablaobras(Model model, @PathVariable Integer id){
       List<Obra> obra = obraSevice.getObraIdAutor(id);
        model.addAttribute("tableobra", obra);
        return "verobras";
    }

    @GetMapping("/formeditarobra/{id}")
    public String formularioeditarobra(Model model, @PathVariable int id){

        Obra obra = obraSevice.getById(id).get();

        List<TipoObra> tipoObraList = tipoObraService.getTipoObra();

        model.addAttribute("obraupd", obra);

        model.addAttribute("combotipodeobra", tipoObraList);
        return "editarobra";
    }

    @GetMapping("/deleteobra/{id}")
    public String eliminarObra(@PathVariable int id){
        obraSevice.deleteById(id);



        return "redirect:/tableartista";
    }

}
