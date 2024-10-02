package fundamentos;

public class tiposPrimitivos {

    public static void main(String[] args) {
        // info de um funcionario

        // tipos numericos int
        byte anosDeEmp = 23;
        short numDeVoos = 542;
        int id = 23234;
        long pnotosAcumu = 3_123_133_123L; // 'l' no final

        // tipos numericos reais
        float salario = 11_445.23F;
        //float ee = 0.00F;
        double vendasAcumu = 2_232_233_232.01;

        // tipo booleano
        boolean estaDeFerias = false;

        // tipo caractere
        char status = 'A';

        // dias de empresa
        System.out.println(anosDeEmp * 365);
        // numero de viagens
        System.out.println(numDeVoos / 2);
        // pontos por real
        System.out.println(pnotosAcumu / vendasAcumu);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Ferias?" + estaDeFerias);
        System.out.println("Status: " + status);

        System.out.println(41.41 - 2.89 - 3.99);
    }
}
