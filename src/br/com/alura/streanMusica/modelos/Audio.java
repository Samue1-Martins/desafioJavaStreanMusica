package br.com.alura.streanMusica.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducao;
    private int curtidas;
    private int classificacao;


    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public void setTotalDeReproducao(int totalDeReproducao) {
        this.totalDeReproducao = totalDeReproducao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int curtir(){
        return curtidas;
    }

    public int reproduzir(){
        return totalDeReproducao;
    }

}
