package com.kursova.kep.firma.repository;

import com.kursova.kep.firma.entity.Firma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * by Mr Skip on 31.03.2016.
 */

@Repository
public interface FirmaRepo extends JpaRepository<Firma, Long>{
}
