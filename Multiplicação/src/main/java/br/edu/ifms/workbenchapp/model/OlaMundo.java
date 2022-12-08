package br.edu.ifms.workbenchapp.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OlaMundo {
    private Integer x;
    private Integer y;

    public Mult(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

}
