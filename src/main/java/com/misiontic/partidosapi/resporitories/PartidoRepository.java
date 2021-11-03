package com.misiontic.partidosapi.resporitories;


import com.misiontic.partidosapi.models.Partido;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidoRepository extends MongoRepository<Partido,String> {

  
}
