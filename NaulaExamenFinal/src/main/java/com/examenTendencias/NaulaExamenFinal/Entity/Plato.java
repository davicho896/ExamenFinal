package com.examenTendencias.NaulaExamenFinal.Entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "plato")
@Data
public class Plato {


    @Id
    private Long id_plato;
            private String  nombrePl;

            private String Descripcion;

            private String precio;

}
