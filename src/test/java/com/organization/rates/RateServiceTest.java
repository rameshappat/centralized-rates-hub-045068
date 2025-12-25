package com.organization.rates;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class RateServiceTest {
    private RateService rateService;

    @BeforeEach
    void setUp() {
        rateService = new RateService();
    }

    @Test
    void testCreateAndRetrieveRate() {
        Rate rate = new Rate("1", "Savings", BigDecimal.valueOf(0.05), LocalDateTime.now(), LocalDateTime.now().plusMonths(6));
        rateService.createRate(rate);
        assertEquals(rate, rateService.getRateById("1").orElse(null));
    }

    @Test
    void testUpdateRate() {
        Rate rate = new Rate("1", "Savings", BigDecimal.valueOf(0.05), LocalDateTime.now(), LocalDateTime.now().plusMonths(6));
        rateService.createRate(rate);
        rate.setValue(BigDecimal.valueOf(0.06));
        rateService.updateRate(rate);
        assertEquals(rate, rateService.getRateById("1").orElse(null));
    }

    @Test
    void testDeleteRate() {
        Rate rate = new Rate("1", "Savings", BigDecimal.valueOf(0.05), LocalDateTime.now(), LocalDateTime.now().plusMonths(6));
        rateService.createRate(rate);
        rateService.deleteRate("1");
        assertFalse(rateService.getRateById("1").isPresent());
    }
}