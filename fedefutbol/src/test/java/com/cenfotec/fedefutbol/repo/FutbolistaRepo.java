package com.cenfotec.fedefutbol.repo;

import com.cenfotec.fedefutbol.entities.Futbolista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FutbolistaRepo extends JpaRepository<Futbolista, Long> {
}
