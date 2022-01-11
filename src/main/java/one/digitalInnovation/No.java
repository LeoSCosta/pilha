package one.digitalInnovation;

public class No { //A classe nó representará os dados que serão armazenados na pilha.

    private int dado; //O atributo dado será a representação do dado em si.
    private No refNO = null; //O atributo refNO será o responsavel por guardar o proximo Nó.

    public No(int dado) {
        this.dado = dado;
    }

    public No() {
    }

    public int getDado() {
        return dado;
    }

    public No getRefNO() {
        return refNO;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public void setRefNO(No reNO) {
        this.refNO = reNO;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
