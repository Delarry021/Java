package estruturas.básicas;

public class Arvore<T extends Comparable> {

    private TNode<T> raiz = null;

    public void add(T valor) {
        TNode<T> novoElemento = new TNode<T>(valor);

        if (raiz == null) {
            this.raiz = novoElemento;
        } else {
            TNode<T> atual = this.raiz;
            while (true) {
                if (atual.getElemento().compareTo(novoElemento.getElemento()) == 1) {
                    if (atual.getEsq() != null) {
                        atual = atual.getEsq();
                    } else {
                        atual.setEsq(novoElemento);
                        break;
                    }
                    if (atual.getDir() != null) {
                        atual = atual.getDir();
                    } else {
                        atual.setDir(novoElemento);
                        break;
                    }
                }
            }
        }
    }
    
    public void emOrdem()
    {
        Elemento<T> atual
    }
}
