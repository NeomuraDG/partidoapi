package com.misiontic.partidosapi.controllers;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.misiontic.partidosapi.models.Equipo;
import com.misiontic.partidosapi.services.EquipoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
@RestController
@RequestMapping("/api/v1")
public class EquipoController {
    private EquipoService _equipoService;

    @Autowired
    public EquipoController(EquipoService equipoService){
        this._equipoService = equipoService;
    }

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping("/equipos")
    public List<Equipo> findAll()
    {
        return this._equipoService.findAll();
    }

    @PostMapping("/equipos")
    ResponseEntity<Map<String,String>> save(@RequestBody Equipo equipo){
        this._equipoService.save(equipo);
        Map<String,String> response = new HashMap<>();
        response.put("mensaje","El equipo se ha registrado correctamente");
        return ResponseEntity.ok(response);

    }

    @PutMapping("/equipos")
    ResponseEntity<Map<String,String>> update(@RequestBody Equipo equipo){
        this._equipoService.save(equipo);
        Map<String,String> response = new HashMap<>();
        response.put("mensaje","El equipo se ha actualizado correctamente");
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/equipos/{id}")
    ResponseEntity<Map<String,String>> delete(@PathVariable String id){
        this._equipoService.deleteById(id);
        Map<String,String> response = new HashMap<>();
        response.put("mensaje","El equipo se ha eliminado correctamente");
        return ResponseEntity.ok(response);
    }

}
