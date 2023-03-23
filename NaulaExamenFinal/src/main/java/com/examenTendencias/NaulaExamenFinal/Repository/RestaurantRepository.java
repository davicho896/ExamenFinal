package com.examenTendencias.NaulaExamenFinal.Repository;

import com.examenTendencias.NaulaExamenFinal.Entity.Restaurante;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestaurantRepository extends MongoRepository<Restaurante,Long> {
}
