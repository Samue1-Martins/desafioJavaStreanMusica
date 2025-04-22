package br.com.alura.streanMusica.modelos;

import br.com.alura.streanMusica.Caulculos.Classificavel;

public class Musicas extends Audio implements Classificavel {
    private String album;
    private String artista;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
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
        System.out.println("Escute essa nova música " + getTitulo() + ", do artista " + getArtista());
        System.out.println("Com duração de: " + getDuracao() + " minutos.");
        System.out.println("Album: " + getAlbum());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Classificação: " + getClassificavel());
    }
}
