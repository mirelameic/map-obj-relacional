package com.museubd.model.bean;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "permanentes")
@Data
public class Permanentes{

    @Id
    @Column(name = "num_obj5")
    private int num_obj5;

    @Column(name = "emExposicao")
    private String emExposicao;

    @Column(name = "dataAquisicao")
    private Date dataAquisicao;

}