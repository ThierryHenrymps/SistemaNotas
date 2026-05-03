package Controller;

public class GerenciadorTurma {
    private String nomeTurma;
    private Aluno[] alunos = new Aluno[4];
    private int contador = 0;

    public String getNomeTurma() {
        return nomeTurma;
    }
    public int getQuantidadeAlunos() {
        return contador;
    }
    public Aluno getAluno(int i) {
        return (i >= 0 && i < contador) ? alunos[i] : null;
    }

    public GerenciadorTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public void adicionarAluno(Aluno a) {
        if (contador < 5) {
            alunos[contador++] = a;
            System.out.println("->" + a.getNome() + " foi para a sala");
        } else {
            System.out.println("Sala lotada");
        }
    }

    public void listaAlunos() {
        System.out.println(nomeTurma + ":");
        if (contador == 0) {
            System.out.println("nenhum aluno");
            return;
        }
        for (int i = 0; i < contador; i++) {
            System.out.println((i) + ". " + alunos[i]);
        }
    }

    public void emitirBoletins() {
        System.out.println("Boletim da turma: " + nomeTurma);
        for (int i = 0; i < contador; i++) {
            System.out.println(alunos[i].boletim());
        }
    }
        public void contarAprovados() {
            boolean aprovados = false;
            for (int i = 0; i < contador; i++) {
                if (alunos[i].VS().equals("APROVADO")) {
                    System.out.println(alunos[i].getNome()+"("+String.format("%.2f", alunos[i].media())+")");
                    aprovados = true;

                }
            }
             if(!aprovados){
                 System.out.println("Nenhum aluno aprovado");
             }
        }

    public void exibirMaiorMedia() {
        double maiorMedia = alunos[0].media();
        String nomeMaior = alunos[0].getNome();

        for (int i = 1; i < contador; i++) {
            if (alunos[i].media() > maiorMedia) {
                maiorMedia = alunos[i].media();
                nomeMaior = alunos[i].getNome();
            }
        }

        System.out.println("Aluno com a maior media: "+nomeMaior+" ("+maiorMedia+")");
    }
    }


