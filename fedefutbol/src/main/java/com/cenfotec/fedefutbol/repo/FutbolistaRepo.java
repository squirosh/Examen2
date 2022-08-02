package com.cenfotec.fedefutbol.repo;

import com.cenfotec.fedefutbol.entities.Futbolista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FutbolistaRepo extends JpaRepository<Futbolista, Long> {
    Optional<Futbolista> findByNombreContaining(String word);

    @Override
    Optional<Futbolista> findById(Long aLong);
}
