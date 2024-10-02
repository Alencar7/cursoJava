package estruturasdeControle;

public class ROTULANDOBreakEContinue {
    public static void main(String[] args) {
/** LIBERDADE PARA NOMEAR LACOS COMO 'FOR'
 * posso colaocar um 'break' direcionado */

        externo: for (int i = 0; i < 3; i++)
        {
            interno: for (int j = 0; j < 3; j++)
            {
                if (i == 1) {
                    break;
                    //break externo;
                }
                System.out.printf("(%d %d)", i, j);
            }
            System.out.println();
        }
        System.out.println("Fim do BREAK!");

        /** LIBERDADE PARA NOMEAR LACOS COMO 'FOR'
         * posso colaocar um 'continue' direcionado */
        externo: for (int ii = 0; ii < 3; ii++)
        {
            interno: for (int jj = 0; jj < 3; jj++)
            {
            if (ii == 1) {
                continue externo;
                //continue interno;
                }
            System.out.printf("(%d %d)", ii, jj);
            }
        System.out.println();
        }
        System.out.println("Fim do CONTINUE!");
    }
}

