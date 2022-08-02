package com.cenfotec.fedefutbol.services;

import com.cenfotec.fedefutbol.entities.Futbolista;
import com.cenfotec.fedefutbol.repo.FutbolistaRepo;
import com.cenfotec.fedefutbol.utilities.MHelpers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Service
public class FutbolistaServiceImpl implements  FutbolistaService {

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

    @Override
    public Futbolista findById(Long id) {
        Optional<Futbolista> futbolista = this.futbolistaRepo.findById(id);
        if(!futbolista.isPresent()){
            return null;
        }
        return MHelpers.modelMapper().map(futbolista.get(), Futbolista.class);
    }

    @Override
    public Futbolista findByName(String nombre) {
        Optional<Futbolista> futbolista = this.futbolistaRepo.findByNombreContaining(nombre);
        if(!futbolista.isPresent()){
            return null;
        }
        return MHelpers.modelMapper().map(futbolista.get(), Futbolista.class);
    }

    private Futbolista convertToFut(final Futbolista futbolista){
        return MHelpers.modelMapper().map(futbolista, Futbolista.class);
    }


}

