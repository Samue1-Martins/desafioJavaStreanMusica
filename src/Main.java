import br.com.alura.streanMusica.Caulculos.FiltroRecomendacao;
import br.com.alura.streanMusica.modelos.Musicas;
import br.com.alura.streanMusica.modelos.Podcasts;

public class Main {
    public static void main(String[] args) {

        Podcasts P = new Podcasts();
        FiltroRecomendacao filtro = new FiltroRecomendacao();

        P.setTitulo("The news");
        P.setDuracao(13);
        P.setTotalDeReproducao(250);
        P.setCurtidas(25);
        P.setEpisodio("O skate 4 vai ser lançado em 2026!");
        P.setSobre("Dê o play e fique por dentro de tudo que é mais relevante no Brasil e no mundo, sempre de uma maneira leve, descontraída e bem-humorada.");

        P.informacoes();
        filtro.filtra(P);

        Musicas M = new Musicas();
        M.setTitulo("Apolo Nästy");
        M.setArtista("Rudies Flacko");
        M.setAlbum("Aposlo Nästy");
        M.setDuracao(2.09);
        M.setTotalDeReproducao(200);
        M.setCurtidas(80);

        M.informacoes();
        filtro.filtra(M);
        }
    }