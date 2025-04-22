package br.com.alura.streanMusica.Caulculos;

public class FiltroRecomendacao {
    public void filtra (Classificavel classificavel){
        if (classificavel.getClassificavel() >= 4){
            System.out.println("Está entre os preferidos dos ouvintes!");
        }else if (classificavel.getClassificavel() >= 2){
            System.out.println("Bem avaliado no momento.");
        }else {
            System.out.println("Talvez você possa gostar.");
        }
    }
}
