package com.kursova.kep.specifications.entity;

import com.kursova.kep.entity.BaseEntity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * by Mr Skip on 31.03.2016.
 */
@Entity
public class Specifications extends BaseEntity {
    private Long id;
    private String typeOfPrinter;
    private String size;
    private String typeOfCartridge;
    private Double weight;
    private Integer speed;
    private String cartrigeResource;
    private Integer interfaceI;

    public Specifications() {
    }

    public Specifications(Long id,
                          String typeOfPrinter,
                          String size,
                          String typeOfCartridge,
                          Double weight,
                          Integer speed,
                          String cartrigeResource,
                          Integer interfaceI
    ) {
        this.id = id;
        this.typeOfPrinter = typeOfPrinter;
        this.size = size;
        this.typeOfCartridge = typeOfCartridge;
        this.weight = weight;
        this.speed = speed;
        this.cartrigeResource = cartrigeResource;
        this.interfaceI = interfaceI;
    }

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type_of_printer")
    public String getTypeOfPrinter() {
        return typeOfPrinter;
    }

    public void setTypeOfPrinter(String typeOfPrinter) {
        this.typeOfPrinter = typeOfPrinter;
    }

    @Basic
    @Column(name = "size")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Basic
    @Column(name = "type_of_cartridge")
    public String getTypeOfCartridge() {
        return typeOfCartridge;
    }

    public void setTypeOfCartridge(String typeOfCartridge) {
        this.typeOfCartridge = typeOfCartridge;
    }

    @Basic
    @Column(name = "weight")
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "speed")
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Basic
    @Column(name = "cartrige_resource")
    public String getCartrigeResource() {
        return cartrigeResource;
    }

    public void setCartrigeResource(String cartrigeResource) {
        this.cartrigeResource = cartrigeResource;
    }

    @Basic
    @Column(name = "interface")
    public Integer getInterfaceI() {
        return interfaceI;
    }

    public void setInterfaceI(Integer interfaceI) {
        this.interfaceI = interfaceI;
    }
}
