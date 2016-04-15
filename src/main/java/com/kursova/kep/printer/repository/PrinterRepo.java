package com.kursova.kep.printer.repository;

import com.kursova.kep.printer.entity.Printer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * by Mr Skip on 31.03.2016.
 */

@Repository
public interface PrinterRepo extends JpaRepository<Printer, Long> {
}
