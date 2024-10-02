package estruturasdeControle;

public class UsandoSwitch {

    public static void main(String[] args) {
        String faixa = "vermelha";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki...");
            case "roxa":
                System.out.println("Sei o Heian G...");
            case "verde":
                System.out.println("Sei o Heian Y...");
            case "laranja":
                System.out.println("Sei o Heian S...");
            case "vermelha":
                System.out.println("Sei o Heian N...");
            case "amarela":
                System.out.println("Sei o Heian S...");
                break;
            default: //tipo um else no switch
                System.out.println("Nao sei nada. ");
        }
    }
}
