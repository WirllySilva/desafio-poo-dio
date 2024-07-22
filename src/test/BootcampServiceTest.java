package test;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.service.BootcampService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BootcampServiceTest {

    @Test
    void deveInscreverDevEmBootcamp() {
        BootcampService service = new BootcampService();
        Bootcamp bootcamp = new Bootcamp();
        Dev dev = new Dev();

        Curso curso = new Curso();
        curso.setTitulo("Curso de Teste");
        curso.setDescricao("Descrição do Curso de Teste");
        curso.setCargaHoraria(8);
        bootcamp.getConteudos().add(curso);

        service.inscreverDevEmBootcamp(dev, bootcamp);

        assertEquals(1, dev.getConteudosInscritos().size());
    }
}
