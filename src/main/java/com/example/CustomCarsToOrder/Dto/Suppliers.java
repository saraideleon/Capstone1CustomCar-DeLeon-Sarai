package com.example.CustomCarsToOrder.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="supplier_master")
public class Suppliers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="supplier_Id")
    private Integer supplierId;

    @NotEmpty
    @Size(max=20)
    @Column(name ="supp_name")
    private String suppName;

    @NotEmpty
    @Size(max=60)
    @Column(name ="supp_email")
    private String suppEmail;

    @NotEmpty
    @Size(max=20)
    @Column(name ="supp_phone")
    private String suppPhone;

    public Integer getSuppId() {
        return supplierId;
    }
    public void setSuppId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSuppName() {
        return suppName;
    }

    public void setSuppName(String suppName) {
        this.suppName = suppName;
    }

    public String getSuppEmail() {
        return suppEmail;
    }

    public void setSuppEmail(String suppEmail) {
        this.suppEmail = suppEmail;
    }

    public String getSuppPhone() {
        return suppPhone;
    }

    public void setSuppPhone(String suppPhone) {
        this.suppPhone = suppPhone;
    }
}


