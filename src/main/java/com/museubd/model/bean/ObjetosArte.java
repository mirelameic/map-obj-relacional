package com.museubd.model.bean;

import lombok.Data;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "objetosArte")
@Data
public class ObjetosArte {

    @Id
    @Column(name = "numID")
    private int numID;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "nomeArtista")
    private String nomeArtista;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "anoCriacao")
    private Date anoCriacao;

    @Column(name = "periodoArt")
    private String periodoArt;

    @Column(name = "paisCultura")
    private String paisCultura;

    @Column(name = "estilo")
    private String estilo;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "status")
    private String status;

    @Column(name = "custo")
    private double custo;

}