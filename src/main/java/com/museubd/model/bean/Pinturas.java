package com.museubd.model.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "pinturas")
@Data
public class Pinturas extends Obra implements Serializable {

    @Column(name = "tipoTinta")
    private String tipoTinta;

    @Column(name = "suporte")
    private String suporte;
}
