package br.com.dio.desafio.repository;

import br.com.dio.desafio.dominio.Bootcamp;

import java.util.HashSet;
import java.util.Set;

public class BootcampRepository {
    private Set<Bootcamp> bootcamps = new HashSet<>();

    public void adicionarBootcamp(Bootcamp bootcamp) {
        bootcamps.add(bootcamp);
    }

    public Set<Bootcamp> listarBootcamps() {
        return bootcamps;
    }

    public Bootcamp buscarBootcampPorNome(String nome) {
        return bootcamps.stream()
                .filter(bootcamp -> bootcamp.getNome().equals(nome))
                .findFirst()
                .orElse(null);
    }
}
