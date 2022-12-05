package br.edu.ifms.calculadora.controller;

import br.edu.ifms.calculadora.model.Calculadora;
import br.edu.ifms.calculadora.service.CalculadoraService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/calculator")
public class CalculadoraController {

    @Autowired
    private CalculadoraService service;

    @GetMapping(value = "/{num1}/{num2}")
    public Integer calculatorPathParam(@PathVariable String num1, @PathVariable String num2) {
        if (num1.matches("[0-9]+") && num2.matches("[0-9]+")) {
            return Integer.parseInt(num1) + Integer.parseInt(num2);
        } else {
            log.info("Soma da Calculadora só pode ter números", HttpStatus.ALREADY_REPORTED);
        }
        return null;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Calculadora calculatorPost(@RequestBody Calculadora calculadoraing) {
        log.info("Soma da Calculadora só pode ter números", HttpStatus.ALREADY_REPORTED);
        return service.create(calculadoraing);
    }

}
