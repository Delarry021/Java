package estruturas.básicas;

public class ListaSimples<T> {

    private Node<T> inicio;
    private Node<T> ultimo;

    private int tamanho = 0;

    //ADICIONAR UM VALOR NO FINAL DA LISTA
    public void adicionar(T elemento) {
        Node<T> celula = new Node<T>(elemento);

        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }

        this.ultimo = celula;
        this.tamanho++;
    }

    //REMOVER DA LISTA
    public void remove(T elemento) {
        Node<T> atual = inicio;
        Node<T> anterior = null;

        for (int i = 0; i < tamanho; i++) { //percorre a lista ate achar o elemento a ser removido
            if (atual.getElemento() == elemento) {
                if (atual == inicio && atual == ultimo) //quando so tem 1 elemento na lista
                {
                    inicio = null;
                    ultimo = null;
                }
                else if (atual == inicio) { //remover o primeiro
                    inicio = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == ultimo) { //remover o ultimo
                    ultimo = anterior;
                    anterior.setProximo(null);
                } else { //caso geral
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
    
    //REMOVER ULTIMO
    public void removerUltimo()
    {
        Node<T> atual = ultimo;
        T elemento;
        
        elemento = atual.getElemento();
        
        remove(elemento);
    }
    
    public void removerPrimeiro()
    {
        Node<T> atual = inicio;
        T elemento;
        
        elemento = atual.getElemento();
        
        remove(elemento);
    }

    //PESQUISAR NA LISTA
    public void search(T elemento) {
        Node<T> aux = inicio;

        do {
            aux = aux.getProximo(); //percorre o vetor ate achar o elemento
        } while (aux != null && aux.getElemento() != elemento);

        if (aux != null) {
            System.out.println("\tElemento " + aux.getElemento() + " encontrado!");
        } else {
            System.out.println("\tElemento " + elemento + " não encontrado!");
        }
    }

    //LIMPAR DA LISTA
    public void limpar() {
        for (Node<T> atual = this.inicio; atual != null;) { //AJUDA NO GERENCIAMENTO DE MEMORIA

            Node<T> aux = atual.getProximo();

            atual.setElemento(null);
            atual.setProximo(null);
            atual = aux;
        }

        inicio = null;
        ultimo = null;
        tamanho = 0;

    }

    //VER O TAMANHO DA LISTA
    public void size() {
        System.out.println("\tTamanho: " + tamanho);
    }

    //IMPRIMIR
    public void imprimir() {
        if (this.tamanho == 0) //SE A LISTA FOR VAZIA
        {
            System.out.println("\tElementos: []");
        } else {

            Node<T> atual = this.inicio; //POSICIAO ATUAL DO VETOR COMEÇANDO NA POSICAO INICIAL

            System.out.print("\tElementos: [ ");

            for (int i = 0; i < this.tamanho - 1; i++) //PERCORRE OS NOS ATE O PENULTIMO
            {
                System.out.print(atual.getElemento() + " - ");
                atual = atual.getProximo();
            }

            System.out.println(atual.getElemento() + " ]");
        }
    }

}
