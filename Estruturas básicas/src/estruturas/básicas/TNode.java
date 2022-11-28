package estruturas.básicas;

public class TNode<T> {

    private T elemento = null;
    private TNode<T> esq = null;
    private TNode<T> dir = null;

    public TNode(T elemento) {
        this.elemento = elemento;
        this.dir = null;
        this.esq = null;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public TNode<T> getEsq() {
        return esq;
    }

    public void setEsq(TNode<T> esq) {
        this.esq = esq;
    }

    public TNode<T> getDir() {
        return dir;
    }

    public void setDir(TNode<T> dir) {
        this.dir = dir;
    }

}
