package com.kursova.kep.firma.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kursova.kep.entity.BaseEntity;
import com.kursova.kep.printer.entity.Printer;

import javax.persistence.*;
import java.util.Set;

/**
 * by Mr Skip on 31.03.2016.
 */
@Entity
public class Firma extends BaseEntity {
    private Long id;
    private String name;
    private String country;
    private String address;
    private String phoneNumber;
    private String pibManager;
    private String email;
    private String webSite;
    @JsonIgnore
    private Set<Printer> printers;

    public Firma() {
    }

    public Firma(Long id,
                 String name,
                 String country,
                 String address,
                 String phoneNumber,
                 String pibManager,
                 String email,
                 String webSite
    ) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.pibManager = pibManager;
        this.email = email;
        this.webSite = webSite;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "pib_manager")
    public String getPibManager() {
        return pibManager;
    }

    public void setPibManager(String pibManager) {
        this.pibManager = pibManager;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "web_site")
    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    @OneToMany(mappedBy = "firma")
    public Set<Printer> getPrinters() {
        return printers;
    }

    public void setPrinters(Set<Printer> printers) {
        this.printers = printers;
    }
}
