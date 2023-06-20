package com.museubd.model.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "esculturas")
@Data
public class Esculturas extends Obra implements Serializable {

    @Column(name = "material")
    private String material;

    @Column(name = "altura")
    private int altura;

    @Column(name = "peso")
    private int peso;

}