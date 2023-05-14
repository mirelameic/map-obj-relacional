package com.museubd.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "expostoEm")
@Data
public class ExpostoEm {

    @Id
    @Column(name = "num_obj6")
    private int num_obj6;

    @Column(name = "nomeExposicao")
    private String nomeExposicao;

}