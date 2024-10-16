package padroes.observer;

import java.util.*;

public class Porteiro {

    private List<ObservadorChegadaAniersariante> observadores =
            new ArrayList<>();

    //met registrar
    public void registrarObservador(ObservadorChegadaAniersariante observador){
        observadores.add(observador);
    }

    //monitoramento  = metodo -> monitorar()
    public void monitorar(){
        Scanner scanner = new Scanner(System.in);

        String valor = "";

        while (!"sair".equalsIgnoreCase(valor)){

            System.out.println("O aniversariante chegou? ");
            valor = scanner.nextLine();

            if ("sim".equalsIgnoreCase(valor)){
                //criar o evento
                EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
                //notificar os observadores
                observadores.stream().forEach(o -> o.chegou(evento));
                valor = "sair"; //final do evento
            } else {
                System.out.println("Alarme falso!");
            }
        }

        scanner.close();

    }

}
