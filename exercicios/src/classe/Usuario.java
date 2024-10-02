package classe;

public class Usuario {
    String nome;
    String email;

    public boolean equals(Object objeto) {

        if (objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto; //colocando obj para 'usuario'

            boolean nomeIgual = outro.nome.equals(this.nome); // var nomeIgual recebe
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }else {
            return false;
        }
    }
}
