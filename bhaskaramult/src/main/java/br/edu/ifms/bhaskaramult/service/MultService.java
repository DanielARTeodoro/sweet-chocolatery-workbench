package br.edu.ifms.bhaskaramult.service;

import br.edu.ifms.bhaskaramult.exception.NotNumericException;
import br.edu.ifms.bhaskaramult.model.Mult;
import org.springframework.stereotype.Service;

@Service
public class MultService {
    public Integer multiplicar(Mult multing) {
        try {
            return multing.getX() * multing.getY();
        } catch (Exception exception) {
            throw new NotNumericException("Não é permitido letras na conta!");
        }

    }
}
