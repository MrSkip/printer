package com.kursova.kep.firma.service;

import com.kursova.kep.access.jpa.AccessDAO;
import com.kursova.kep.firma.entity.Firma;
import com.kursova.kep.firma.repository.FirmaRepo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * by Mr Skip on 31.03.2016.
 */

@Service
public class FirmaService extends AccessDAO<Firma>{

    private FirmaRepo firmaRepo;

    @Autowired
    public FirmaService(FirmaRepo firmaRepo){
        super(firmaRepo);
        this.firmaRepo = firmaRepo;
    }

}
