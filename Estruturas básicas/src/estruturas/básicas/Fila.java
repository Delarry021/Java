package estruturas.básicas;

public class Fila<T>{
    
    ListaSimples lista = new ListaSimples<Integer>();
    
    public void enfilhar(T elemento)
    {
        lista.adicionar(elemento);
    }
    
    public void desenfilhar()
    {
        lista.removerPrimeiro();
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
