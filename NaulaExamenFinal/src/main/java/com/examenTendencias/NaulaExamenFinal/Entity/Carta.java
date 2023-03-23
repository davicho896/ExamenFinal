package com.examenTendencias.NaulaExamenFinal.Entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "carta")
@Data
public class Carta {


    @Id
    private Long id_cart;

    private String  nombre;

    private String categoria;

    private String cantidad;

    private List<Plato> listPlato;


}
