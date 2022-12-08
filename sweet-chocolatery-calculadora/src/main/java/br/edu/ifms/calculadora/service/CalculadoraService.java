package br.edu.ifms.calculadora.service;

import br.edu.ifms.calculadora.model.Calculadora;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    public Integer soma(Calculadora calculadoraing) {
        return calculadoraing.getNum1() + calculadoraing.getNum2();
    }
}
