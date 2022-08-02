package com.cenfotec.fedefutbol.controller;

import com.cenfotec.fedefutbol.entities.Futbolista;
import com.cenfotec.fedefutbol.services.FutbolistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class FutbolistaController {

    @Autowired
    FutbolistaService futbolistaService;

    @RequestMapping("/")
    private String homePage(Model model) {
        return "index";
    }

    @RequestMapping("/registrar")
    private String getRegistrarPage(Model model) {
        Futbolista fut = new Futbolista();
        model.addAttribute("nueva", fut);
        return "registrar";
    }

    @RequestMapping(value = "/registrar", method = RequestMethod.POST)
    private String postRegistrarPage(Model model, Futbolista nueva, BindingResult result) {
        futbolistaService.registrarFutbolista(nueva);
        return "exito";
    }

    @RequestMapping("/lista")
    private String getListFutbolistas(Model model) {
        model.addAttribute("lista", futbolistaService.listarFutbolistas());
        return "lista";
    }

    @GetMapping(value = "/detalle/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(this.futbolistaService.findById(id));

    }
    @GetMapping(value = "/by/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findById(@PathVariable("nombre") String nombre){
        return ResponseEntity.ok(this.futbolistaService.findByName(nombre));

    }

}
