package exercicio5;

public class Aluno extends Pessoa{
    private String matricula;
    public Aluno(String nome, String sobrenome, String matricula) {
        super(nome, sobrenome);
        this.matricula = matricula;
    }

    public String registrar() {
        return "Sou o " + obterNomeCompleto() + " e minha matrícula é " + matricula + ".";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
