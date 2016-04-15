package com.kursova.kep.printer;

import com.kursova.kep.access.jpa.AccessDAO;
import com.kursova.kep.access.rest.RestBase;
import com.kursova.kep.printer.entity.Printer;
import com.kursova.kep.printer.service.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * by Mr Skip on 31.03.2016.
 */

@RestController
@RequestMapping("printer")
public class PrinterController extends RestBase<Printer> {
    private PrinterService printerService;

    @Autowired
    public PrinterController(PrinterService printerService) {
        super(printerService);
        this.printerService = printerService;
    }
}
