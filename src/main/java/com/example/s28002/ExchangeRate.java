package com.example.s28002;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "exchange_rate")
public class ExchangeRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String currency;
    private int days;
    private double averageRate;
    private LocalDateTime requestDateTime;

    public Long getId() {
        return id;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public int getDays() {
        return days;
    }

    public LocalDateTime getRequestDateTime() {
        return requestDateTime;
    }

    public String getCurrency() {
        return currency;
    }

    public void setAverageRate(double averageRate) {
        this.averageRate = averageRate;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRequestDateTime(LocalDateTime requestDateTime) {
        this.requestDateTime = requestDateTime;
    }
}
