/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tendencias.examenm5billescas.repositorio;

import com.tendencias.examenm5billescas.modelo.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ClaseRepository extends MongoRepository<Profesor, Long>{
    
}
