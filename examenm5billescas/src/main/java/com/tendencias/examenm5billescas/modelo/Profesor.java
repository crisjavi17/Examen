/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.examenm5billescas.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author LENOVO
 */
@Document(collection = "Profesor")
@Data
public class Profesor {

    @JsonProperty("_id")

    private int _id;
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private String celular;
    private List<Periodo> periodos;
    private List<Carrera> carreras;
    private List<Ciclo> ciclos;
    private List<Asignatura> asignaturas;
}
