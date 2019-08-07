package com.example.CustomCarsToOrder.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="individual_parts")
public class IndividualParts  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer indPrtId;

    @NotNull
    private Integer prtId;

    @NotEmpty
    @Length(max = 30)
    private String serialNo;

    @NotEmpty
    @Length(max = 30)
    private String prtStatus;

    @NotNull
    private Double prtPrice;

    public Integer getIndPrtId() {
        return indPrtId;
    }

    public void setIndPrtId(Integer indPrtId) {
        this.indPrtId = indPrtId;
    }

    public Integer getPrtId() {
        return prtId;
    }

    public void setPrtId(Integer prtId) {
        this.prtId = prtId;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getPrtStatus() {
        return prtStatus;
    }

    public void setPrtStatus(String prtStatus) {
        this.prtStatus = prtStatus;
    }

    public Double getPrtPrice() {
        return prtPrice;
    }

    public void setPrtPrice(Double prtPrice) {
        this.prtPrice = prtPrice;
    }
}
