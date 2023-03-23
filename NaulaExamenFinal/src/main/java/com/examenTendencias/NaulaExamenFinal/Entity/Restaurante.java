package com.examenTendencias.NaulaExamenFinal.Entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "restaurante")
@Data
public class Restaurante {


    @Id
    private Long id_rest;
    private String  nombre;

    private String coreo;

    private String telefono;

    private String direccion;

    private List<Cliente> listCliente;

    private List<Carta> listCarta;
}
