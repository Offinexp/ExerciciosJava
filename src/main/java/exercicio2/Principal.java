package exercicio2; //Professor deixei os itens comentados no principal para eu não esquecer o que estava fazendo aqui.

public class Principal {
    public static void main(String[] args) {
        // Aqui estou criando os alunos
        Aluno aluno1 = new Aluno("Lucas", 22, 1234);
        Aluno aluno2 = new Aluno("Maria", 20, 1235);
        Aluno aluno3 = new Aluno("Pedro", 21, 1236);
        Aluno aluno4 = new Aluno("Ana", 19, 1237);
        Aluno aluno5 = new Aluno("João", 23, 1238);

        // Aqui estou criando as turmas
        Turma turmaA = new Turma("Turma A", "1A");
        Turma turmaB = new Turma("Turma B", "1B");

        // Adicionando os alunos nas turmas
        turmaA.adicionarAluno(aluno1);
        turmaA.adicionarAluno(aluno2);
        turmaA.adicionarAluno(aluno3);
        turmaA.adicionarAluno(aluno4);
        turmaA.adicionarAluno(aluno5);

        turmaB.adicionarAluno(aluno1);
        turmaB.adicionarAluno(aluno2);
        turmaB.adicionarAluno(aluno3);
        turmaB.adicionarAluno(aluno4);
        turmaB.adicionarAluno(aluno5);

        // Listando os alunos da turma A
        System.out.println("Alunos da " + turmaA.getNome() + ":");
        turmaA.listarAlunos();

        // Listando alunos da turma B
        System.out.println("Alunos da " + turmaB.getNome() + ":");
        turmaB.listarAlunos();
    }
}