package com.museubd.model.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "artista")
@Data
public class Artista implements Serializable {

    @Id
    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "estiloPrincipal")
    private String estiloPrincipal;

    @Column(name = "periodoArt")
    private String periodoArt;

    @Column(name = "paisOrig")
    private String paisOrig;

    @Column(name = "dataNasc")
    private Date dataNasc;

    @Column(name = "dataMorte")
    private Date dataMorte;

}
