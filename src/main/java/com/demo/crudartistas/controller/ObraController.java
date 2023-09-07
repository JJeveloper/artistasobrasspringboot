package com.demo.crudartistas.controller;

import com.demo.crudartistas.model.Obra;
import com.demo.crudartistas.service.ObraSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ObraController {

    @Autowired
    ObraSevice obraSevice;

    @PostMapping("/createobra")
    public String guardarObra(@ModelAttribute("obr")  Obra obra){
        obraSevice.saveObra(obra);
        return "redirect:/tableartista";
    }
}
