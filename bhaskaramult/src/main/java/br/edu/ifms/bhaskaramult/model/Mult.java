package br.edu.ifms.bhaskaramult.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Mult {
    private Integer x;
    private Integer y;

    public Mult(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }


}