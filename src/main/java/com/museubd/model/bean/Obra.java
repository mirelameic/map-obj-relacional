package com.museubd.model.bean;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
public abstract class Obra implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

}
