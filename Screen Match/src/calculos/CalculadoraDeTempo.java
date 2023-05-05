package calculos;


import modelos.Titulo;

public class CalculadoraDeTempo {
    
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    /*public void inclui (Filme f){
        tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Serie s) {
        this.tempoTotal += s.getDuracaoEmMinutos();
    }*/

    public void inclui (Titulo titulo){
        System.out.println("Adicionando o tempo de: " + titulo.getNome());
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
