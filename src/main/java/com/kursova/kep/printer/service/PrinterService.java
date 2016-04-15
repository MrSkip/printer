package com.kursova.kep.printer.service;

import com.kursova.kep.access.jpa.AccessDAO;
import com.kursova.kep.printer.entity.Printer;
import com.kursova.kep.printer.repository.PrinterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * by Mr Skip on 31.03.2016.
 */

@Service
public class PrinterService extends AccessDAO<Printer>{
    private PrinterRepo printerRepo;

    @Autowired
    public PrinterService(PrinterRepo printerRepo){
        super(printerRepo);
        this.printerRepo = printerRepo;
    }
}
