package com.museubd.model.bean;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "colecao")
@Data
public class Colecao {

    @Id
    @Column(name = "nomeColecao")
    private String nomeColecao;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "pessoaColecao")
    private String pessoaContato;

    @Column(name = "tipoColecao")
    private String tipoColecao;
}
