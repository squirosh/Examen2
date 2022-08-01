package com.cenfotec.fedefutbol.services;

import com.cenfotec.fedefutbol.entities.Futbolista;
import com.cenfotec.fedefutbol.repo.FutbolistaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FutbolistaServiceImpl implements FutbolistaService {

    @Autowired
    FutbolistaRepo futbolistaRepo;

    @Override
    public void registrarFutbolista(Futbolista futbolista){
        futbolistaRepo.save(futbolista);
    }

    @Override
    public List<Futbolista> listarFutbolistas(){
        return futbolistaRepo.findAll();
    }
}
