/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.examenm5billescas.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author LENOVO
 */
@Document(collection = "Periodo")
@Data
public class Periodo {

    @JsonProperty("_id")

    private int idperiodo;
    private String periodo;
    private int year;

}
