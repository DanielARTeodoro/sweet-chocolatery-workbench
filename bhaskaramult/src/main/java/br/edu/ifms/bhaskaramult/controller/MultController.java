package br.edu.ifms.bhaskaramult.controller;

import br.edu.ifms.bhaskaramult.exception.NotNumericException;
import br.edu.ifms.bhaskaramult.model.Mult;
import br.edu.ifms.bhaskaramult.service.MultService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/mult")
public class MultController {


    @Autowired
    private MultService service;

    /// Método GET
    @GetMapping(value = "/{x}/{y}")
    public Double getMultPathParam(@PathVariable String x, @PathVariable String y) {
        ///if (x.matches("[0-9].") && y.matches("[0-9].")) {
        try {
            Double num1 = Double.parseDouble(x);
            Double num2 = Double.parseDouble(y);
            return num1 * num2;
        } catch (Exception e) {
            //} else {
            throw new NotNumericException("Não é permitido letras na conta!");
        }
    }

    /// Método POST
    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Double multPost(@RequestBody Mult multing) {
        log.info("Multiplicação da Conta só pode ter números - Erro: 502", HttpStatus.BAD_GATEWAY.toString());
        log.info("Multiplicação da Conta só pode ter números - Erro: 400", HttpStatus.BAD_REQUEST.toString());
        log.info("Multiplicação da Conta não aceitar tal requisição - Erro: 510", HttpStatus.NOT_EXTENDED.toString());
        return service.multiplicar(multing);

    }

}
