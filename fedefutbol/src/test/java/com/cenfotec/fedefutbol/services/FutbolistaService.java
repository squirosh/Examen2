package com.cenfotec.fedefutbol.services;

import com.cenfotec.fedefutbol.entities.Futbolista;

import java.util.List;

public interface FutbolistaService {
    void registrarFutbolista(Futbolista futbolista);

    List<Futbolista> listarFutbolistas();
}
