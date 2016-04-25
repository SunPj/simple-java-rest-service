package com.upwork.test.auldanov.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Service providing general calculation methods such as add, subtract, multiply, divide
 *
 * @author kraken
 * @since 4/25/16.
 */
@Service
public class CalculatorService {
    public BigDecimal add(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    public BigDecimal subtract(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public BigDecimal divide(BigDecimal a, BigDecimal b) {
        return a.divide(b, MathContext.DECIMAL128);
    }
}