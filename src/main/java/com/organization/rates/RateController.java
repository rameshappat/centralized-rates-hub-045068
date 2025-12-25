package com.organization.rates;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/rates")
public class RateController {
    private final RateService rateService;

    public RateController(RateService rateService) {
        this.rateService = rateService;
    }

    @PostMapping
    public Rate createRate(@RequestBody Rate rate) {
        return rateService.createRate(rate);
    }

    @GetMapping("/{id}")
    public Rate getRate(@PathVariable String id) {
        return rateService.getRateById(id).orElseThrow(() -> new ResourceNotFoundException("Rate not found"));
    }

    @GetMapping
    public List<Rate> getAllRates() {
        return rateService.getAllRates();
    }

    @PutMapping
    public void updateRate(@RequestBody Rate rate) {
        rateService.updateRate(rate);
    }

    @DeleteMapping("/{id}")
    public void deleteRate(@PathVariable String id) {
        rateService.deleteRate(id);
    }
}