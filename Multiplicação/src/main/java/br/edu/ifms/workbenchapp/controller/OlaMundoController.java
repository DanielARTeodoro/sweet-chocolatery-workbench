package br.edu.ifms.workbenchapp.controller;

import br.edu.ifms.workbenchapp.exception.NotNumericException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mult")
public class OlaMundoController {

    /// Método GET
    @GetMapping(value = "/{x}/{y}")
    public Integer getMultPathParms(@PathVariable String x, @PathVariable String y){
         if(x.matches("[0-9]+") && y.matches("[0-9]+")){
             return Integer.parseInt(x) * Integer.parseInt(y);
         } else {
             throw new NotNumericException("Só é permitido Números na Conta!");
         }
    }
}
