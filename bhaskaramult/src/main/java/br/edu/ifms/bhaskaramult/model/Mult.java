package br.edu.ifms.bhaskaramult.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Mult {
    private Double x;
    private Double y;

    public Mult(Double x, Double y) {
        this.x = x;
        this.y = y;
    }


}
