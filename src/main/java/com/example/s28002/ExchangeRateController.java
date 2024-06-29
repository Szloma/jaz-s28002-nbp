package com.example.s28002;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exchange-rate")
public class ExchangeRateController {
    @Autowired
    private ExchangeRateService exchangeRateService;

    @Operation(summary = "Wyświetlenie użytkownikowi danych z podanego przedziału", description= "Wartość musi istnieć")
    @GetMapping("/{currency}")
    public ExchangeRate getAverageExchangeRate(@PathVariable String currency, @RequestParam(value = "days", defaultValue = "1") int days)
    {
        return exchangeRateService.getAverageExchangeRate(currency, days);
    }
}
