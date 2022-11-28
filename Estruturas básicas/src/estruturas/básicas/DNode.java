package estruturas.básicas;

public class DNode<T> {
    
    private T elemento; //ELEMENTO INICIAL
    private DNode<T> proximo; //ELEMENTO SUCESSOR
    private DNode<T> anterior;

    //CONSTRUTORES
    //QUANDO SE POE O PRIMEIRO VALOR
    public DNode(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    //QUANDO JA TEM MAIS DE UM VALOR 
    public DNode(T elemento, DNode<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }
    
    public DNode(T elemento, DNode<T> proximo, DNode<T> anterior) {
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
    }
    

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public DNode<T> getProximo() {
        return proximo;
    }

    public void setProximo(DNode<T> proximo) {
        this.proximo = proximo;
    }

    public DNode<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(DNode<T> anterior) {
        this.anterior = anterior;
    }
    
}
