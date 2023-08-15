package br.com.alura.ScreenMatch2.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {

        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {

        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {

        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {

        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        String exibeFichaTecnicaCompleta = """
                Nome do Filme: %s;
                Ano de lançamento: %d;
                Duração em minutos: %d;
                Incluído no plano: %b;
                """.formatted(nome, anoDeLancamento, duracaoEmMinutos, incluidoNoPlano);
        System.out.println(exibeFichaTecnicaCompleta);
    }

    public void avalia (double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia () {

        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
