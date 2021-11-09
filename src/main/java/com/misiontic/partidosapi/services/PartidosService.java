package com.misiontic.partidosapi.services;

import java.util.List;

import com.misiontic.partidosapi.models.Partido;
import com.misiontic.partidosapi.resporitories.PartidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartidosService {
    
    private PartidoRepository _partidoRepository;

    @Autowired
    public PartidosService(PartidoRepository partidoRepository){
        this._partidoRepository = partidoRepository;
    }

    public void save(Partido partido){
        this._partidoRepository.save(partido);
    }

    public List<Partido> findAll(){
        return this._partidoRepository.findAll();
    }
}
