package com.demo.crudartistas.controller;


import com.demo.crudartistas.model.Autor;
import com.demo.crudartistas.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.PublicKey;
import java.util.List;

@Controller
public class AutorController {

    @Autowired
    AutorService autorService;

    @GetMapping("/formartista")
    public String artista(){
        return "agregarartista";
    }

    @PostMapping("/createautor")
    public String  guardarArtista(@ModelAttribute("sabeA") Autor autor){
        autorService.saveAutor(autor);
        return "redirect:/tableartista";
    }


}
