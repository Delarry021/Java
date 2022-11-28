package estruturas.básicas;

//ESTRUTURA BASICA DE UMA LISTA ENCADEADA COM GENERICS EM JAVA
public class Node<T> {

    private T elemento; //ELEMENTO INICIAL
    private Node<T> proximo; //ELEMENTO SUCESSOR

    //CONSTRUTORES
    //QUANDO SE POE O PRIMEIRO VALOR
    public Node(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    //QUANDO JA TEM MAIS DE UM VALOR 
    public Node(T elemento, Node<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Node<T> getProximo() {
        return proximo;
    }

    public void setProximo(Node<T> proximo) {
        this.proximo = proximo;
    }


}
