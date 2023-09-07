package com.demo.crudartistas.controller;

import com.demo.crudartistas.model.Autor;
import com.demo.crudartistas.model.Obra;
import com.demo.crudartistas.model.TipoObra;
import com.demo.crudartistas.service.AutorService;
import com.demo.crudartistas.service.TipoObraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private AutorService autorService;

    @Autowired
    private TipoObraService tipoObraService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/formguardartipodeobra")
    public String tipoDeObra(){
        return "tipodeobra";
    }


    @GetMapping("/tableartista")
    public String tablaArtista(Model model){

        List<TipoObra> tipoObraList = tipoObraService.getTipoObra();

        model.addAttribute("tableautor", autorService.getAutor());

        model.addAttribute("obr",new Obra());

        model.addAttribute("combotipodeobra",tipoObraList);

        return "artista";
    }


}
