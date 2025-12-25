package com.organization.rates;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Rate {
    private String id;
    private String name;
    private BigDecimal value;
    private LocalDateTime effectiveDate;
    private LocalDateTime expiryDate;

    // Constructor
    public Rate(String id, String name, BigDecimal value, LocalDateTime effectiveDate, LocalDateTime expiryDate) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.effectiveDate = effectiveDate;
        this.expiryDate = expiryDate;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public LocalDateTime getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }
}