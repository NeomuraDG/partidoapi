package com.misiontic.partidosapi.resporitories;

import com.misiontic.partidosapi.models.Equipo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepository extends MongoRepository<Equipo,String> {
    
}
