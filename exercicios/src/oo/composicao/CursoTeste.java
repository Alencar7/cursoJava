package oo.composicao;

public class CursoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web");
        Curso curso3 = new Curso("React Native");

        //add ALUNO no CURSO
        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        //add CURSO no ALUNO
        aluno1.adicinoarCurso(curso3);
        aluno2.adicinoarCurso(curso3);
        aluno3.adicinoarCurso(curso3);

        for(Aluno aluno: curso1.alunos){
            System.out.println("Estou matriculado no curso " + curso1.nome);
            System.out.println(" e meu nome e " + aluno.nome);
            System.out.println(" ");
        }

        //ver todos os alunos do curso
        System.out.println(aluno1.cursos.get(0).alunos); //precisa do toString

        //criacao de uma variavel para resultado da pesquisa
        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
        //verificando a resposta do metodo
        if (cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }

    }
}
