package com.museubd.model.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "emprestados")
@Data
public class Emprestados implements Serializable {

    @Id
    @Column(name = "num_obj4")
    private int num_obj4;

    @Column(name = "nomeColecao")
    private String nomeColecao;

    @Column(name = "dataEmprestimo")
    private Date dataEmprestimo;

    @Column(name = "dataDevolucao")
    private Date dataDevolucao;

}
