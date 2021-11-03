package com.misiontic.partidosapi.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.misiontic.partidosapi.utils.BCrypt;
import com.misiontic.partidosapi.models.Usuario;
import com.misiontic.partidosapi.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {
    private UsuarioService _usuarioService ;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this._usuarioService = usuarioService;
    }


    @PostMapping("/usuarios")
    ResponseEntity<Map<String,String>> save(@RequestBody Usuario usuario){
        usuario.setPassword(BCrypt.hashpw(usuario.getPassword(), BCrypt.gensalt()));
        Usuario u = this._usuarioService.findByUsername(usuario.getUsername());
        Map<String,String> response = new HashMap<>();
        System.out.println(u.getId());
        if(u.getId() == null){
            this._usuarioService.save(usuario);
            response.put("mensaje","El usuario se ha registrado correctamente");
        }else{
            response.put("mensaje","El usuario ya se encuentra registrado");
        }
        return ResponseEntity.ok(response);
    }
    @GetMapping("/usuarios")
    public List<Usuario> findAll()
    {
        return this._usuarioService.findAll();
    }

}
