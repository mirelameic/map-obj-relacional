package com.museubd.model.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Outros")
@Data
public class Outros{

    @Id
    
    @Column(name = "num_obj3")
    private int num_obj3;

    @Column(name = "tipo")
    private String tipo;

}