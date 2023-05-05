package modelos;

import calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    private String diretor;

    
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificação() {
        return (int) pegaMedia() / 2;
    }

    //teste
    
    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
