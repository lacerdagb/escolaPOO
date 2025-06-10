package models;

public class Aluno {
    private String nome;
    private String matricula;
    private int idade;
    private double notaFinal;
    
    public Aluno(String nome, String matricula, int idade)  { // Não bota a notaFinal no construtor
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0.0 && notaFinal <= 10.0) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println("Erro: A nota final deve estar entre 0.0 e 10.0");
        }
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", idade=" + idade + ", notaFinal=" + notaFinal
                + "]";
    }
}
