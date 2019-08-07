package com.example.CustomCarsToOrder.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="parts_type")
public class PartsType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer prtId;

    @NotEmpty
    @Length(max = 60)
    private String prtName;

    @NotNull
    @Column(name = "supplier_Id")
    private Integer supplierId;

    public Integer getPrtId() {
        return prtId;
    }

    public void setPrtId(Integer prtId) {
        this.prtId = prtId;
    }

    public String getPrtName() {
        return prtName;
    }

    public void setPrtName(String prtName) {
        this.prtName = prtName;
    }


    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

}

