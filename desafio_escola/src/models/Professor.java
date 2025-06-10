package models;

public class Professor {
    private String nome;
    private String disciplina;
    private double salario;
    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        setSalario(salario); // para verificar o valor negativo
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if(salario > 0.0) {
            this.salario = salario;
        }else{
            System.out.println("ERROOOO: Deve ser maior que 0.");
        }
    }

    // @Override
    // public String toString() {
    //     return "Professor [nome=" + nome + ", disciplina=" + disciplina + ", salario=" + salario + "]";
    // }
    public void exibirDetalhes() {
        System.out.println();
        System.out.println("Professor: " + this.nome);
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Sálario: " + this.salario);
    }
}
