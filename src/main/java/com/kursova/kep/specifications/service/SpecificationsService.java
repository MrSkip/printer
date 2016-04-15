package com.kursova.kep.specifications.service;

import com.kursova.kep.access.jpa.AccessDAO;
import com.kursova.kep.specifications.entity.Specifications;
import com.kursova.kep.specifications.repository.SpecificationsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * by Mr Skip on 31.03.2016.
 */

@Service
public class SpecificationsService extends AccessDAO<Specifications>{
    private SpecificationsRepo specificationsRepo;

    @Autowired
    public SpecificationsService(SpecificationsRepo specificationsRepo) {
        super(specificationsRepo);
    }
}
