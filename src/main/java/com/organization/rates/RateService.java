package com.organization.rates;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class RateService {
    private List<Rate> rates = new ArrayList<>();

    public Rate createRate(Rate rate) {
        rates.add(rate);
        return rate;
    }

    public Optional<Rate> getRateById(String id) {
        return rates.stream().filter(rate -> rate.getId().equals(id)).findFirst();
    }

    public List<Rate> getAllRates() {
        return new ArrayList<>(rates);
    }

    public void updateRate(Rate updatedRate) {
        rates.removeIf(rate -> rate.getId().equals(updatedRate.getId()));
        rates.add(updatedRate);
    }

    public void deleteRate(String id) {
        rates.removeIf(rate -> rate.getId().equals(id));
    }
}