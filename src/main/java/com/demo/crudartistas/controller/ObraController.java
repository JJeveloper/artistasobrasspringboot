package com.demo.crudartistas.controller;

import com.demo.crudartistas.model.Obra;
import com.demo.crudartistas.service.ObraSevice;
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

    @PostMapping("/createobra")
    public String guardarObra(@ModelAttribute("obr")  Obra obra){
        obraSevice.saveObra(obra);
        return "redirect:/tableartista";
    }

    @GetMapping("/tableverobra/{id}")
    public String tablaobras(Model model, @PathVariable Integer id){
       List<Obra> obra = obraSevice.getObraIdAutor(id);
        model.addAttribute("tableobra", obra);
        return "verobras";
    }

}
