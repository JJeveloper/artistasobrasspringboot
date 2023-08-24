package com.demo.crudartistas.controller;

import com.demo.crudartistas.model.TipoObra;
import com.demo.crudartistas.service.TipoObraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TipoObraController {

    @Autowired
    TipoObraService tipoObraService;

   @PostMapping("/createtipodeobra")
   public String guardarTipoDeObra(@ModelAttribute("saveTO") TipoObra tipoObra){
       tipoObraService.saveTipoObra(tipoObra);
       return "redirect:/";
   }


}
