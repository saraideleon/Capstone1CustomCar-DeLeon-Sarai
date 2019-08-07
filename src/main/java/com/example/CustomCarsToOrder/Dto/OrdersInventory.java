package com.example.CustomCarsToOrder.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="orders_inventory")
public class OrdersInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ordDetailId;

    @NotNull
    private Integer ordId;

    @NotNull
    private Integer indPrtId;

    public Integer getOrdDetailId() {
        return ordDetailId;
    }

    public void setOrdDetailId(Integer ordDetailId) {
        this.ordDetailId = ordDetailId;
    }

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getIndPrtId() {
        return indPrtId;
    }

    public void setIndPrtId(Integer indPrtId) {
        this.indPrtId = indPrtId;
    }
}