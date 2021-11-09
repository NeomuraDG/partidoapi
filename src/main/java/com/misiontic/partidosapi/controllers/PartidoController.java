package com.misiontic.partidosapi.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.misiontic.partidosapi.models.Partido;
import com.misiontic.partidosapi.services.PartidosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PartidoController {
    private PartidosService _partidoService ;

    @Autowired
    public PartidoController(PartidosService usuarioService){
        this._partidoService = usuarioService;
    }

    @GetMapping("/partidos")
    public List<Partido> findAll(){
        return this._partidoService.findAll();
    }

    @PostMapping("/partidos")
    ResponseEntity<Map<String,String>> save(@RequestBody Partido partido){
    
        this._partidoService.save(partido);
        Map<String,String> response = new HashMap<>();
        response.put("mensaje","El partido se ha registrado correctamente");
        return ResponseEntity.ok(response);

    }

    
    
}
