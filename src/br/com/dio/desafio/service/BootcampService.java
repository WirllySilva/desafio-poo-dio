package br.com.dio.desafio.service;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Conteudo;

import java.util.Optional;
import java.util.Set;

public class BootcampService {

    public void inscreverDevEmBootcamp(Dev dev, Bootcamp bootcamp) {
        dev.inscreverBootcamp(bootcamp);
    }

    public void progredirDev(Dev dev) {
        dev.progredir();
    }

    public double calcularTotalXpDev(Dev dev) {
        return dev.calcularTotalXp();
    }

    public Set<Conteudo> listarConteudosInscritos(Dev dev) {
        return dev.getConteudosInscritos();
    }

    public Set<Conteudo> listarConteudosConcluidos(Dev dev) {
        return dev.getConteudosConcluidos();
    }
}