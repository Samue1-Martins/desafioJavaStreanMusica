package br.com.alura.streanMusica.modelos;

import br.com.alura.streanMusica.Caulculos.Classificavel;

public class Podcasts extends Audio implements Classificavel {
        private String episodio;
        private String sobre;

    public String getEpisodio() {
        return episodio;
    }

    public void setEpisodio(String episodio) {
        this.episodio = episodio;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    @Override
    public int getClassificavel() {
        if(getTotalDeReproducao() > 100) {
            return 4;
        } else {
            return 2;
        }
    }

    public void informacoes(){
        System.out.println("Este é o podcast " + getTitulo() + ", seu programa diario, esté é o episodio: " + getEpisodio());
        System.out.println("Com duração de: " + getDuracao() + " minutos.");
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Sobre: " + getSobre());
        System.out.println("Classificação: " + getClassificavel());
    }
}
