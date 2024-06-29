package com.example.s28002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ExchangeRateService {
    @Autowired
    private NBPClient nbpClient;
    @Autowired
    private ExchangeRateRepository exchangeRateRepository;
    public ExchangeRate getAverageExchangeRate(String currency, int days) {

        NBPResponse response = nbpClient.getExchangeRates(currency, days);
        List<NBPResponse.Rate> rates = response.getRates();
        double averageRate = rates.stream().mapToDouble(NBPResponse.Rate::getMid).average().orElse(0);

        ExchangeRate exchangeRate = new ExchangeRate();

        exchangeRate.setCurrency(currency);
        exchangeRate.setDays(days);
        exchangeRate.setAverageRate(averageRate);
        exchangeRate.setRequestDateTime(LocalDateTime.now());

        exchangeRateRepository.save(exchangeRate);
        return exchangeRate;
    }
}

