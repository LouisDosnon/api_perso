package com.example.persoapi.repository;

import com.example.persoapi.entity.Perso;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersoRepository extends MongoRepository<Perso, String> {
}
