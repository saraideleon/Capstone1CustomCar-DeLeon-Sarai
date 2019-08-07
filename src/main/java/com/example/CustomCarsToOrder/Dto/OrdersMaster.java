package com.example.CustomCarsToOrder.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="orders_master")
public class OrdersMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ordId;

    @NotNull
    private Date ordStartDate;

    @NotNull
    private Date ordCompletionDate;

    @NotNull
    private Date ordStatus;

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Date getOrdStartDate() {
        return ordStartDate;
    }

    public void setOrdStartDate(Date ordStartDate) {
        this.ordStartDate = ordStartDate;
    }

    public Date getOrdCompletionDate() {
        return ordCompletionDate;
    }

    public void setOrdCompletionDate(Date ordCompletionDate) {
        this.ordCompletionDate = ordCompletionDate;
    }

    public Date getOrdStatus() {
        return ordStatus;
    }

    public void setOrdStatus(Date ordStatus) {
        this.ordStatus = ordStatus;
    }
}