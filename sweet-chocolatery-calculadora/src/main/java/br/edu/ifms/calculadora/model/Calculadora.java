package br.edu.ifms.calculadora.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.security.PrivateKey;

@Getter
@Setter
@NoArgsConstructor
public class Calculadora {
    private Integer num1;
    private Integer num2;

    public Calculadora(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
