package com.misiontic.partidosapi.services;

import java.util.List;
import java.util.Optional;

import com.misiontic.partidosapi.models.Usuario;
import com.misiontic.partidosapi.resporitories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    private UsuarioRepository _usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository){
        this._usuarioRepository = usuarioRepository;
    }

    public void save(Usuario usuario){
        this._usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll(){
        return this._usuarioRepository.findAll();
    }


    public Optional<Usuario> findById(String id){
        return this._usuarioRepository.findById(id);
    }

    public void deleteById(String id){
        this._usuarioRepository.deleteById(id);
    }

    public Boolean existById(String id){
        return this._usuarioRepository.existsById(id);
    }

    public Usuario findByUsername(String username){
        return this._usuarioRepository.findByUsername(username).orElse(new Usuario());
    } 
}
