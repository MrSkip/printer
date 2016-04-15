package com.kursova.kep.entity;

import java.io.Serializable;

/**
 * by Mr Skip on 31.03.2016.
 */

public class BaseEntity implements Serializable{

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
