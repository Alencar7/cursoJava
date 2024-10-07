package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {
        // reusando Aluno e List<Aluno>
        Aluno a1 = new Aluno("ana", 7.2);
        Aluno a2 = new Aluno("pedro", 9.2);
        Aluno a3 = new Aluno("sofia", 5.6);
        Aluno a4 = new Aluno("jao", 10);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return 1;
            if(aluno1.nota < aluno2.nota) return -1;
            return 0; //mesma nota?
        };

        Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
            if(aluno1.nota < aluno2.nota) return 1;
            if(aluno1.nota > aluno2.nota) return -1;
            return 0; //mesma nota?
        };

        System.out.println("-----------MELHOR NOTA-------------");
        //melhorNota(COMPARATOR) = MAX
        System.out.println(alunos.stream().max(melhorNota).get());
        //melhorNota(COMPARATOR) = MIN
        System.out.println(alunos.stream().min(melhorNota).get());

        System.out.println("-----------PIOR NOTA-------------");
        //piorNota = MAX
        System.out.println(alunos.stream().max(melhorNota).get());
        //piorNota = MIN
        System.out.println(alunos.stream().min(melhorNota).get());

    }
}
