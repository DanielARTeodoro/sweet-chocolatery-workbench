package br.edu.ifms.workbenchapp.model;

public class OlaMundo {
    private String saudacao;
    private Double soma;

    public OlaMundo(String nome) {
        this.saudacao = "Olá " + nome + "!";
    }

    public String getSaudacao() {
        return saudacao;
    }

    public Double getSoma() {
        return soma;
    }

    public void depositar(Double valor){
        soma += valor;
    }

    public void verificaSoma(){
        System.out.println("Valor da Soma: "+getSoma());
    }


}