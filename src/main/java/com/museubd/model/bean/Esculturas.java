package com.museubd.model.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "esculturas")
@Data
public class Esculturas {

    @Id
    @Column(name = "num_obj2")
    private int num_obj2;

    @Column(name = "material")
    private String material;

    @Column(name = "altura")
    private int altura;

    @Column(name = "peso")
    private int peso;

}