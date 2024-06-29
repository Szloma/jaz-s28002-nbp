package com.example.s28002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exchange-rate")
public class ExchangeRateController {
    @Autowired
    private ExchangeRateService exchangeRateService;

    @ApiOperation(value = "Wyświetlenie użytkownikowi danych z przedziału")
    @GetMapping("/{currency}")
    public ExchangeRate getAverageExchangeRate(@PathVariable String currency, @RequestParam(value = "days", defaultValue = "1") int days)
    {
        return exchangeRateService.getAverageExchangeRate(currency, days);
    }
}
