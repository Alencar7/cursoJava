package estruturasdeControle;

public class ForDentroFor {

    public static void main(String[] args) {
        // um laco dentro de um laco
        for(int i = 0; i < 7; i++){
        //o for i so assumira ++ apos 1 ciclo completo do for ii
            for(int ii = 0; ii < 5; ii++){
                System.out.printf("[%d %d] ", i, ii);
            }
            System.out.println();
        }
    }
}
