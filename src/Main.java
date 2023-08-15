import br.com.alura.ScreenMatch2.modelos.Episodio;
import br.com.alura.ScreenMatch2.modelos.Filme;
import br.com.alura.ScreenMatch2.modelos.Serie;
import br.com.alura.screematch.calculos.CalculadoraDeTempo;
import br.com.alura.screematch.calculos.FiltroRecomendacao;

public class Main {
    public static void main(String[] args) {
        Filme myFilm = new Filme();
        myFilm.setNome("The Batman");
        myFilm.setAnoDeLancamento(2022);
        myFilm.setDuracaoEmMinutos(156);
        myFilm.setIncluidoNoPlano(true);
        System.out.println("Duração do filme: " + myFilm.getDuracaoEmMinutos());


        myFilm.exibeFichaTecnica ();
        myFilm.avalia(8);
        myFilm.avalia(9);
        myFilm.avalia(8);
        myFilm.avalia(10);
        myFilm.avalia(7);
        System.out.println("Total de avaliações: " + myFilm.getTotalDeAvaliacoes());
        System.out.println(myFilm.pegaMedia());



        Serie gotham = new Serie();
        gotham.setNome("Gotham");
        gotham.setAnoDeLancamento(2014);
        gotham.exibeFichaTecnica();
        gotham.setTemporadas(5);
        gotham.setEpisodiosPorTemporada(20);
        gotham.setMinutosPorEpisodio(50);
        gotham.setIncluidoNoPlano(true);
        System.out.println("Duração para maratonar Gotham: " + gotham.getDuracaoEmMinutos());

        Filme otherFilm = new Filme();
        otherFilm.setNome("Liga da Justiça");
        otherFilm.setAnoDeLancamento(2020);
        otherFilm.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(myFilm);
        calculadora.inclui(otherFilm);
        calculadora.inclui(gotham);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(myFilm);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(gotham);
        episodio.setTotalVisualizacoes(100);
        filtro.filtra(episodio);

    }
}
