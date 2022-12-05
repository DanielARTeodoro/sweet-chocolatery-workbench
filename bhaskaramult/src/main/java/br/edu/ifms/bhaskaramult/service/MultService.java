package br.edu.ifms.bhaskaramult.service;

import br.edu.ifms.bhaskaramult.model.Mult;
import org.springframework.stereotype.Service;

@Service
public class MultService {
    public Mult create(Mult multing) {
        Integer s = multing.getX() * multing.getY();
        return multing;
    }
}
