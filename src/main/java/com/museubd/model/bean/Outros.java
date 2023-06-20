package com.museubd.model.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "outros")
@Data
public class Outros implements Serializable {

    @Id
    @Column(name = "num_obj3")
    private Long num_obj3;

    @Column(name = "tipo")
    private String tipo;

}