package com.example.s28002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NBPResponse {
    private String table;
    private String currency;
    private String code;

    private List<Rate> rates;
    public String getCurrency() {
        return currency;
    }

    public String getTable() {
        return table;
    }

    public String getCode() {
        return code;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public static class Rate {
        private String no;
        private String effectiveDate;
        private double mid;

        public double getMid() {
            return mid;
        }

        public String getEffectiveDate() {
            return effectiveDate;
        }

        public String getNo() {
            return no;
        }
    }

}



