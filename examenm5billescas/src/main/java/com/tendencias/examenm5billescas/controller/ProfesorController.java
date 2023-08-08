/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.examenm5billescas.controller;



import com.tendencias.examenm5billescas.modelo.Profesor;
import com.tendencias.examenm5billescas.service.ClaseServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("/api/profesor")
public class ProfesorController {
    
    @Autowired
    ClaseServiceImpl servProf;
    
    @GetMapping("/listar")
    public ResponseEntity<List<Profesor>> listarProfesor() {
        return new ResponseEntity<>(servProf.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Profesor> crearProfesor(@RequestBody Profesor p) {
        return new ResponseEntity<>(servProf.save(p), HttpStatus.CREATED);
    }
    
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Profesor> actualizarProfesor(@PathVariable Long id, @RequestBody Profesor p) {
        Profesor profesor = servProf.findById(id);
        if (profesor == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            
            p.set_id(profesor.get_id());
            return new ResponseEntity<>(servProf.save(p), HttpStatus.OK);
            
        }
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Profesor> eliminarProducto(@PathVariable Long id) {
        servProf.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
