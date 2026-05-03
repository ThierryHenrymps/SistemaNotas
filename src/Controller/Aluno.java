package Controller;

public class Aluno {
    private String nome;
    private String matricula;
    private double nota1, nota2, nota3;

    public String toString(){
        return "Aluno: "+nome+", matricula: "+matricula+", Nota1: "+nota1+", Nota2: "+nota2+", Nota3: "+nota3;
    }
    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

    }
    public Aluno() {
        this.nome = "Sem nome";
        this.matricula = "000";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0;
    }

    public void setAllN(double nota1, double nota2, double nota3){
        this.nota1 = nota1; this.nota2 = nota2; this.nota3 = nota3;
    }

    public double media(){
        return (nota1 + nota2 + nota3) /3.0 ;
    }

    public String VS() {
        if (media() >= 6.0) {
            return "APROVADO";
        } else if (media() >= 4.0) {
            return "RECUPERAÇÃO";
        } else {
            return "REPROVADO";
        }
    }
    public String boletim(){
        return String.format("Aluno: %s, Matrícula: %s, Notas: %.1f/%.1f/%.1f, Média: %.2f, Situação: %s",
                nome, matricula, nota1, nota2, nota3, media(), VS());
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


    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}
