package com.upwork.test.auldanov.controller;

import com.upwork.test.auldanov.model.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kraken on 4/25/16.
 */
@RestController
public class CalculatorRestController {
    @RequestMapping("/sum")
    public Result sum() {
        return new Result<>(1);
    }
}
