package fundamentos;

public class tipoString {

    public static void main(String[] args) {
        //secao 3 : FENDAMENTOS - Aula 29
        String s = "Boa tarde";
        System.out.println(s.startsWith("Boa")); //return: true/false
        System.out.println(s + "!!!");
        System.out.println(s.toUpperCase().endsWith("TARDE")); //return: true/false
        System.out.println(s.length()); // return: 9
        //IMPORTANTE
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var idade = 13;
        var salario = 1349.987;

        System.out.printf("Nome: %s. \nIdade: %d \nSalario: %.2f", nome, idade, salario);

        String frase = String.format("Nome: %s. \nIdade: %d \nSalario: %.2f", nome, idade, salario);
        System.out.println(frase);
        System.out.println(frase.substring(7)); // comecano caracere 7



    }
}
