package com.misiontic.partidosapi.services;

import java.util.List;
import java.util.Optional;

import com.misiontic.partidosapi.models.Equipo;
import com.misiontic.partidosapi.resporitories.EquipoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipoService {
    
    private EquipoRepository _equipoRepository;

    @Autowired
    public EquipoService(EquipoRepository equipoRepository){
        this._equipoRepository = equipoRepository;
    }

    public void save(Equipo equipo){
        this._equipoRepository.save(equipo);
    }

    public List<Equipo> findAll(){
        return this._equipoRepository.findAll();
    }


    public Optional<Equipo> findById(String id){
        return this._equipoRepository.findById(id);
    }

    public void deleteById(String id){
        this._equipoRepository.deleteById(id);
    }

    public Boolean existById(String id){
        return this._equipoRepository.existsById(id);
    }
}
