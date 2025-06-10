package models;

public class Turma {
    private String codigoTurma;
    private int serie;
    private int quantidadeAlunos;

    public Turma(String codigoTurma, int serie) {
        this.codigoTurma = codigoTurma;
        this.serie = serie;
        setQuantidadeAlunos(serie);
    }

    public String getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        if (quantidadeAlunos > 0.0) {
            this.quantidadeAlunos = quantidadeAlunos;
        } else {
            System.out.println("ERROOOO: A quantidade de alunos deve ser maior que 0");
        }
    }

    public void exibirTurma() {
        System.out.println();
        System.out.println("Turma: " + this.codigoTurma);
        System.out.println("Série: " + this.serie);
        System.out.println("Quantidade de alunos: " + this.quantidadeAlunos);
    }
}
