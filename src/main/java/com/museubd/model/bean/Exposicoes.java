package com.museubd.model.bean;
import javax.persistence.*;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "exposicoes")
@Data
public class Exposicoes implements Serializable {

    @Id
    private int id;

    @Column(name = "nomeExposicao")
    private String nomeExposicao;

    @Column(name = "dataInicio")
    private Date dataInicio;

    @Column(name = "dataFinal")
    private Date dataFinal;

    @OneToMany
    private List<Obra> pinturas;

}
