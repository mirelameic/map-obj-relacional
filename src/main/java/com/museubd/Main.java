package com.museubd;

import com.museubd.model.bean.Pinturas;
import com.museubd.model.repository.Repository;

import java.util.List;

public class Main {
    private static Repository repository;

    public static void main(String[] args) {
        repository = new Repository();
        Pinturas pintura = new Pinturas();
        pintura.setSuporte("Tripé de madeira simples");
        pintura.setTipoTinta("Base de óleo");
        repository.save(pintura);
        List pinturaPersistida = repository.findAll(Pinturas.class);
        System.out.println(pinturaPersistida.get(0).toString());
    }
}
