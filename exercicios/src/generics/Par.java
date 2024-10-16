package generics;

import java.util.Objects;

public class Par <C, V> {

    private C chave;
    private V valor;

    public Par(){}

    public Par(C chave,V valor) {
        super();
        this.chave = chave;
        this.valor = valor;
    }

    public C getChave() { return chave; }

    public void setChave(C chave) { this.chave = chave; }

    public V getValor() { return valor; }

    public void setValor(V valor) {this.valor = valor; }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        Par<?, ?> par = (Par<?, ?>) object;
        return Objects.equals(chave, par.chave);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chave);
    }
}
