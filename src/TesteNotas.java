import Controller.Aluno;
import Controller.GerenciadorTurma;

import static Utils.Menu.menu;
import java.util.Scanner;
public class TesteNotas {

    public static void main(String[] agrs){
        GerenciadorTurma turmaA = new GerenciadorTurma("3 ANO A");

        Aluno aluno1 = new Aluno("Arthur", "2024001", 8.5, 7.0, 9.2);
        Aluno aluno2 = new Aluno("Guilherme", "2024002", 6.8, 7.5, 6.2);

        Aluno aluno3 = new Aluno();

        aluno3.setNome("Marcos");
        aluno3.setMatricula("2024003");
        aluno3.setAllN(1.0, 5.8, 4.0);

        turmaA.adicionarAluno(aluno1);
        turmaA.adicionarAluno(aluno2);
        turmaA.adicionarAluno(aluno3);

        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            menu();
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("processando ...");
                    turmaA.emitirBoletins();

                    break;
                case 2:
                    System.out.println("alunos aprovados: ");
                    turmaA.contarAprovados();

                    break;
                case 3:
                    turmaA.exibirMaiorMedia();

                    break;
                case 4:
                    System.out.println("++ Alterar notas ++");
                    turmaA.listaAlunos();

                    System.out.println("Digite o numero do aluno (0, 1 ou 2): ");
                    int indice = input.nextInt();

                    if (indice < 0 || indice > 2){
                        System.out.println("numero invalido");
                        input.close();
                        return;
                    }

                    Aluno alunoSelecionado = turmaA.getAluno(indice);
                    if (alunoSelecionado == null) {
                        System.out.println("aluno nao encontrado");
                        return;
                    }

                    System.out.println("digite as novas notas: ");
                    System.out.print("primeira nota: ");
                    double n1 = input.nextDouble();
                    System.out.print("segunda nota: ");
                    double n2 = input.nextDouble();
                    System.out.print("terceira nota: ");
                    double n3 = input.nextDouble();
                    alunoSelecionado.setAllN(n1, n2, n3);
                    System.out.println(alunoSelecionado.boletim());

                    break;
                case 0:
                    System.out.println("encerrando ...");
                    break;

                default:
                    System.out.println("opcao invalida");
            }

        }while (opcao != 0);

    }
}
