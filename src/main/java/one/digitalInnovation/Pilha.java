package one.digitalInnovation;

public class Pilha { //O metodo pilha sera o responsavel por todos metodos necessarios para criar uma pilha

    private No refNoEntrada; //O metodo guarda a referencia do ultimo nó (por se tratar de uma estrutura FIFO
    // esse é o nó que tem a refencia aos proximos nós).

    public Pilha() {
        this.refNoEntrada = null;
    }

    public void push(No novoNo){ //O metodo push adiciona mais um nó a pilha
        No aux = refNoEntrada;
        refNoEntrada = novoNo; //O nó novo se torno o nó de referencia
        refNoEntrada.setRefNO(aux); // e o antigo nó de referencia se torna o proximo nó
    }

    public No pop(){ //O metodo pop retira o ultimo nó adicionado
        if(!isEmpty()){
            No poped = refNoEntrada;
            refNoEntrada = refNoEntrada.getRefNO();
            //O nó de referecia se torna o ao qual ele aponta(proximo nó ou o penultimo nó a ser inserido)
            return poped;
        }
        return null;
    }

    public No top(){
        return refNoEntrada;
    }

    public boolean isEmpty(){
        return refNoEntrada == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "----------------\n" + "   pilha   \n" + "----------------\n";

        No aux = refNoEntrada;

        while(true){
            if(aux != null){
                stringRetorno += "[No{dado=" + aux.getDado()+ "}]\n";
                aux = aux.getRefNO();
            }else{
                break;
            }
        }
        stringRetorno +="================== \n";
        return stringRetorno;
    }
}
