package com.kursova.kep.specifications.repository;

import com.kursova.kep.specifications.entity.Specifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * by Mr Skip on 31.03.2016.
 */

@Repository
public interface SpecificationsRepo extends JpaRepository<Specifications, Long> {
}
