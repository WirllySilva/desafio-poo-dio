import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso java poo");
        curso1.setCargaHoraria(10);

        System.out.println(curso1);

    }
}