package com.kursova.kep.firma;

import com.kursova.kep.access.rest.RestBase;
import com.kursova.kep.firma.entity.Firma;
import com.kursova.kep.firma.service.FirmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * by Mr Skip on 31.03.2016.
 */

@RestController
@RequestMapping("firma")
public class FirmaController extends RestBase<Firma>{

    private FirmaService firmaService;

    @Autowired
    public  FirmaController(FirmaService firmaService){
        super(firmaService);
        this.firmaService = firmaService;
    }

}
