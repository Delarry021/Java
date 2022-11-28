package estruturas.básicas;

public class Pilha<T> {
    
    ListaSimples lista = new ListaSimples<Integer>();
    
    public void enpilhar(T elemento)
    {
        lista.adicionar(elemento);
    }
    
    public void desenpilhar()
    {
        lista.removerUltimo();
    }
    
    public void imprimir()
    {
        lista.imprimir();
    }
    
    public void size()
    {
        lista.size();
    }
    
    public void limpar()
    {
        lista.limpar();
    }
}
