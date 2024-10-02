package colecoes;

import java.util.Objects;

public class Usuario {

    String nome;

    Usuario(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "meu nome e: " + this.nome + ".";
    }

    //USAR OS 2 PARA NAO BUGAR A PESQUISA, so da pra pesquisar se usar!
    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Usuario usuario = (Usuario) object;
        return Objects.equals(nome, usuario.nome);
    }


}
