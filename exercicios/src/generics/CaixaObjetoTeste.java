package generics;
//SEM USAR GENERICS <>
public class CaixaObjetoTeste {

    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3); //double -> Double
        // Integer coisa = (Integer) caixaA.abrir(); //cast(Integer) eh perigoso!
        Double coisaA = (Double) caixaA.abrir(); //cast explicito
        System.out.println(coisaA);

        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.guardar("OLA");

        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);

    }
}
