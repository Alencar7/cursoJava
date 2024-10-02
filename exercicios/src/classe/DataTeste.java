package classe;

public class DataTeste {

    public static void main(String[] args) {

        //const default
        Data d1 = new Data();
        d1.ano = 1999;

        //const explicito
        var d2 = new Data(17,11,2000);

        //data1
        //System.out.printf("A data e : %d, %d, %d",d1.dia,d1.mes, d1.ano); //usar printF
        System.out.println(d1.obterDataFormatada());

        String dataFormatada2 = d2.obterDataFormatada();
        System.out.println(dataFormatada2);

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();

    }
}
