import models.Aluno;
import models.Professor;
import models.Turma;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("Carlos Silva", "A12345", 16);
        aluno1.setNotaFinal(10.0);
        System.out.println(aluno1);

        Professor professor1 = new Professor("Ana Souza", "Matemática", 4500.00);
        professor1.exibirDetalhes();

        Professor professor2 = new Professor("Joao Marcos", "Física", -100);
        professor2.exibirDetalhes();

        Turma turma1 = new Turma("A01", 1);
        turma1.setQuantidadeAlunos(100);
        turma1.exibirTurma();
    }
}
