package br.com.dio.desafio.dominio;

public class Projeto extends Conteudo {
    private String linguagem;
    private int duracaoEmDias;

    @Override
    public double calcularXp() {
        return XP_PADRAO + (duracaoEmDias * 1.5);
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public int getDuracaoEmDias() {
        return duracaoEmDias;
    }

    public void setDuracaoEmDias(int duracaoEmDias) {
        this.duracaoEmDias = duracaoEmDias;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", linguagem='" + linguagem + '\'' +
                ", duracaoEmDias=" + duracaoEmDias +
                '}';
    }
}
