package generics;
//USANDO GENERICS <>
public class Caixa <TIPO> {//<TIPO> -> NOTACAO GENERICA

    private TIPO coisa;

    public void guardar(TIPO coisa) {
        this.coisa = coisa;
    }

    public TIPO abrir() {
        return coisa;
    }
}
