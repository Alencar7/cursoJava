package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    Data(){
        //dia = 1;
        //mes = 1;
        //ano = 1970;
        this(1,1,1970); // THIS chama o construtor Data(int dia, mes, ano)
        //this como metodo - chamar construtor dentro de um construtor
    }

    Data( int dia, int mes, int ano){
        this.dia = dia;// this para referenciar a variavel e jogar no parametro de instancia
        this.mes = mes; //para nao ter conflito com nomes USA-SE O THIS
        this.ano = ano; // o THIS aponta para o objeto atual (parametro <-> var de instancia)
    }

    //criar metodo pro print
    String obterDataFormatada(){
        final String formato = "%d/%d/%d"; //var local
        return String.format("%d/%d/%d", this.dia, mes, ano);
    }

    //outro metodo, porem nao tao usual e falho
    void imprimirDataFormatada(){
        System.out.println(this.obterDataFormatada());
    }

}
