package calculos;

public class FiltroRecomendacao {
    

    public void filtra( Classificavel classificavel){
        if (classificavel.getClassificação()>=4){
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificação()>=2){
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
