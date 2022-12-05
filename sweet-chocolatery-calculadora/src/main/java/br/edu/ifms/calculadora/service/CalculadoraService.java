package br.edu.ifms.calculadora.service;

import br.edu.ifms.calculadora.model.Calculadora;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    public Calculadora create(Calculadora calculadoraing) {
        int s = calculadoraing.getNum1() + calculadoraing.getNum2();
        return calculadoraing;
    }
}
