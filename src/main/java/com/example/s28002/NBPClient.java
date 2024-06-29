package com.example.s28002;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "nbpClient", url = "http://api.nbp.pl/api/exchangerates/rates/A")
public interface NBPClient  {
    @GetMapping(value = "/{currency}/last/{days}", consumes = "application/json")
    NBPResponse getExchangeRates(@PathVariable("currency") String currency, @PathVariable("days") int days);


}
