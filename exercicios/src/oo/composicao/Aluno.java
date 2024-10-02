package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome){
        this.nome = nome;
    }

    void adicinoarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this); //bidirecional
    }

    //PROCURAR UM CURSO A PARTIR DE UM NOME
    Curso obterCursoPorNome(String nome) {
        for (Curso curso : this.cursos) {
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }

    //CONVERTER OBJ EM STRING
    public String toString() {
        return nome;
    }
}
