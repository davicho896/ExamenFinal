package com.examenTendencias.NaulaExamenFinal.Controller;


import com.examenTendencias.NaulaExamenFinal.Entity.Restaurante;
import com.examenTendencias.NaulaExamenFinal.Service.IRestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurant")
public class RestautantController {


    @Autowired
    IRestauranteService deptoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Restaurante>> listarDepto() {
        return new ResponseEntity<>(deptoService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Restaurante> crearDepto(@RequestBody Restaurante d) {
        return new ResponseEntity<>(deptoService.save(d), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Restaurante> actualizarDepto(@PathVariable Long id, @RequestBody Restaurante d) {
        Restaurante depEncontrado = deptoService.findById(id);
        if (depEncontrado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                depEncontrado.setNombre(d.getNombre());
                depEncontrado.setCoreo(d.getCoreo());
                depEncontrado.setTelefono(d.getTelefono());
                depEncontrado.setDireccion(d.getDireccion());
                return new ResponseEntity<>(deptoService.save(d), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Restaurante> eliminarDepto(@PathVariable Long id) {
        deptoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
