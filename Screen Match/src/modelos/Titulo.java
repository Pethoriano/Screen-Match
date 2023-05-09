package modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
        @SerializedName("Title")
        private String nome;
        @SerializedName("Year")
        private int anoDeLancamento;
        private boolean incluidonoplano;
        private double somaDasAvaliacoes;
        private int totalDeAvaliacoes;
        private int duracaoEmMinutos;

        
        
    
        public Titulo(String nome, int anoDeLancamento) {
            this.nome = nome;
            this.anoDeLancamento = anoDeLancamento;
        }

        public int getTotalDeAvaliacao(){
            return totalDeAvaliacoes;
        }    
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
        }
    
        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }
    
        public String getNome() {
            return nome;
        }
    
        public int getAnoDeLancamento() {
            return anoDeLancamento;
        }
    
        public boolean isIncluidonoplano() {
            return incluidonoplano;
        }
    
        public double getSomaDasAvaliacoes() {
            return somaDasAvaliacoes;
        }
    
        public int getDuracaoEmMinutos() {
            return duracaoEmMinutos;
        }
    
        public void exibeFichaTecnica(){
            System.out.println("Nome do filme: " + nome);
            System.out.println("Ano de lançamento: " + anoDeLancamento);
        }
    
        public void avalia(double nota){
            somaDasAvaliacoes+=nota;
            totalDeAvaliacoes++;
        }
    
        public double pegaMedia(){
            return somaDasAvaliacoes / totalDeAvaliacoes;
        }

        @Override
        public int compareTo(Titulo outroTitulo) {
          return this.getNome().compareTo(outroTitulo.getNome());
        }

        @Override
        public String toString() {
            return "nome=" + nome + ", anoDeLancamento=" + anoDeLancamento;
        }

        
    }
