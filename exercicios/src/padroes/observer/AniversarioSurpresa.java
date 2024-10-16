package padroes.observer;

public class AniversarioSurpresa {

    public static void main(String[] args) {

        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.registrarObservador(namorada); //registrar e comunicar

        porteiro.registrarObservador(e -> { //@FunctionalInterface
                    System.out.println("Surpresa via lambda");
                    System.out.println("Ocorreu em: " + e.getMomento());
                });

        porteiro.monitorar();

    }
}
