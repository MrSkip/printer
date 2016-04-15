package com.kursova.kep.printer.entity;

import com.kursova.kep.entity.BaseEntity;
import com.kursova.kep.specifications.entity.Specifications;
import com.kursova.kep.firma.entity.Firma;

import javax.persistence.*;

/**
 * by Mr Skip on 31.03.2016.
 */

@Entity
public class Printer extends BaseEntity {

    private Long id;
    private String name;
    private String model;
    private String color;
    private Double price;
    private Integer guaranteeMonth;
    private String graduationYear;
    private Integer salesInYear;
    private Firma firma;

    @OneToOne
    @JoinColumn(name = "specifications_id", referencedColumnName = "id")
    private Specifications specifications;

    public Printer() {
    }

    public Printer(Long id,
                   String name,
                   String model,
                   String color,
                   Double price,
                   Integer guaranteeMonth,
                   String graduationYear,
                   Integer salesInYear,
                   Firma firma,
                   Specifications specifications
    ) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.color = color;
        this.price = price;
        this.guaranteeMonth = guaranteeMonth;
        this.graduationYear = graduationYear;
        this.salesInYear = salesInYear;
        this.firma = firma;
        this.specifications = specifications;
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
    @Column(name = "model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "guarantee_month")
    public Integer getGuaranteeMonth() {
        return guaranteeMonth;
    }

    public void setGuaranteeMonth(Integer guaranteeMonth) {
        this.guaranteeMonth = guaranteeMonth;
    }

    @Basic
    @Column(name = "graduation_year")
    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    @Basic
    @Column(name = "sales_in_year")
    public Integer getSalesInYear() {
        return salesInYear;
    }

    public void setSalesInYear(Integer salesInYear) {
        this.salesInYear = salesInYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Printer printer = (Printer) o;

        if (id != printer.id) return false;
        if (name != null ? !name.equals(printer.name) : printer.name != null) return false;
        if (model != null ? !model.equals(printer.model) : printer.model != null) return false;
        if (color != null ? !color.equals(printer.color) : printer.color != null) return false;
        if (price != null ? !price.equals(printer.price) : printer.price != null) return false;
        if (guaranteeMonth != null ? !guaranteeMonth.equals(printer.guaranteeMonth) : printer.guaranteeMonth != null)
            return false;
        if (graduationYear != null ? !graduationYear.equals(printer.graduationYear) : printer.graduationYear != null)
            return false;
        if (salesInYear != null ? !salesInYear.equals(printer.salesInYear) : printer.salesInYear != null) return false;

        return true;
    }

    @ManyToOne
    @JoinColumn(name = "firma_id", referencedColumnName = "id", nullable = false)
    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }

    public Specifications getSpecifications() {
        return specifications;
    }

    public void setSpecifications(Specifications specifications) {
        this.specifications = specifications;
    }
}
