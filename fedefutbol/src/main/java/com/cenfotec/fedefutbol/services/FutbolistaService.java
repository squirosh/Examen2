package com.cenfotec.fedefutbol.services;

import com.cenfotec.fedefutbol.entities.Futbolista;

import java.util.List;
import java.util.Optional;

public interface FutbolistaService {
    void registrarFutbolista(Futbolista futbolista);

    List<Futbolista> listarFutbolistas();

    Futbolista findById(Long id);

    void update(Futbolista futbolista, Long id);

    Futbolista findByName(String nombre);




}
