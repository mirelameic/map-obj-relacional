package com.museubd.model.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pinturas")
@Data
public class Pinturas {

    @Id
    @Column(name = "num_obj1")
    private int num_obj1;

    @Column(name = "tipoTinta")
    private String tipoTinta;

    @Column(name = "suporte")
    private String suporte;
}