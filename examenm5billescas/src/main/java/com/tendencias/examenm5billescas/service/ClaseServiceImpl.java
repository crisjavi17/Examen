/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.examenm5billescas.service;



import com.tendencias.examenm5billescas.modelo.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.tendencias.examenm5billescas.repositorio.ClaseRepository;

/**
 *
 * @author LENOVO
 */
@Service
public class ClaseServiceImpl extends GenericServiceImpl<Profesor, Long> implements GenericService<Profesor, Long> {

    @Autowired
    ClaseRepository clase1Rep;
    
    @Override
    public CrudRepository<Profesor, Long> getDao() {
        return clase1Rep;
    }
    
}
