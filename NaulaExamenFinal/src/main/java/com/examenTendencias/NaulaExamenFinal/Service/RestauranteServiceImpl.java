package com.examenTendencias.NaulaExamenFinal.Service;

import com.examenTendencias.NaulaExamenFinal.Entity.Restaurante;
import com.examenTendencias.NaulaExamenFinal.Repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service

public class RestauranteServiceImpl extends GenericServiceImpl<Restaurante,Long>implements IRestauranteService{


    @Autowired
    RestaurantRepository restaRepository;
    @Override
    public CrudRepository<Restaurante, Long> getDao() {
        return restaRepository;
    }


}
