package excecao;

import java.util.Objects;

public class Aluno {

    public final String nome; //constates = final
    public final double nota;
    public final boolean bomComportamento;

    public Aluno(String nome, double nota){
        this(nome, nota, true);
    }

    public Aluno(String nome, double nota, boolean bomComportamento ){
       this.nome = nome;
       this.nota = nota;
       this.bomComportamento = bomComportamento;
    }

    public String toString() {
        return nome + " tem nota " + nota;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Aluno aluno = (Aluno) object;
        return Double.compare(nota, aluno.nota) == 0 && bomComportamento == aluno.bomComportamento && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota, bomComportamento);
    }
}
