package exercicio2;

import java.util.ArrayList;

public class Turma {
    private String nome;
    private String codigo;
    private ArrayList<Aluno> alunos;

    public Turma(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    // Getters e Setters para nome e codigo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}