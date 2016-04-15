package com.kursova.kep.specifications;

import com.kursova.kep.access.rest.RestBase;
import com.kursova.kep.specifications.entity.Specifications;
import com.kursova.kep.specifications.service.SpecificationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * by Mr Skip on 31.03.2016.
 */

@RestController
@RequestMapping("specifications")
public class SpecificationsController extends RestBase<Specifications>{
    private SpecificationsService specificationsService;

    @Autowired
    public SpecificationsController(SpecificationsService specificationsService) {
        super(specificationsService);
        this.specificationsService = specificationsService;
    }
}
