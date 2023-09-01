package com.demo.crudartistas.controller;


import com.demo.crudartistas.model.Autor;
import com.demo.crudartistas.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AutorController {

    @Autowired
    AutorService autorService;

    @GetMapping("/formcrearartista")
    public String artistacrear(){
        return "agregarartista";
    }

    @PostMapping("/createautor")
    public String  guardarArtista(@ModelAttribute("sabeA") Autor autor){
        autorService.saveAutor(autor);
        return "redirect:/tableartista";
    }

    @GetMapping("/formeditarautor/{id}")
    public String editarArtista(Model model, @PathVariable int id){
        Autor autor = autorService.getById(id).get();
        model.addAttribute("atrupd", autor);
        return "editarartista";
    }



}
