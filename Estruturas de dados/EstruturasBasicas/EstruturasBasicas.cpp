// EstruturasBasicas.cpp : Este arquivo contém a função 'main'. A execução do programa começa e termina ali.
//

#include <iostream>
#include "ListaSimples.h"
#include "Pilha.h"
#include "ListaOrdenada.h"

class ListaOrdenadaInt : public ListaOrdenada<int> {
    virtual int comparar(int a, int b) {
        return b - a;
    }
};

int main()
{
    ListaSimples<int> lista = ListaSimples<int>();
    lista.adicionar(25);
    lista.adicionar(32);
    lista.adicionar(64);
    lista.adicionar(128);
    lista.remover(1);
    for (int i = 0; i < lista.getTamanho(); i++)
        std::cout << lista.obter(i) << "\n";
    ListaSimples<char*> lista2 = ListaSimples<char*>();
    lista2.adicionar((char*)"UM");
    lista2.adicionar((char*)"DOIS");
    lista2.adicionar((char*)"TRES");
    lista2.adicionar((char*)"QUATRO");
    lista2.remover(1);
    for (int i = 0; i < lista2.getTamanho(); i++)
        std::cout << lista2.obter(i) << "\n";

/*
    std::cout << "Lista Ordenada" << std::endl;
    ListaOrdenadaInt listaord = ListaOrdenadaInt();
    listaord.adicionar(12);
    listaord.adicionar(5);
    listaord.adicionar(51);
    listaord.adicionar(2);
    listaord.imprimirValores();
    std::cout << "\nAgora com Pilha\n";
    Pilha<int> pilha = Pilha<int>();
    pilha.empilhar(1);
    pilha.empilhar(2);
    pilha.empilhar(3);
    int x;
    while ((x = pilha.desempilhar()) != NULL)
        std::cout << x << "\n";
  */  
    /*ListaOrdInt listaOrd = ListaOrdInt();
    listaOrd.adicionar(5);
    listaOrd.adicionar(3);
    listaOrd.adicionar(6);
    listaOrd.adicionar(4);
    listaOrd.imprimirValores();*/

}

// Executar programa: Ctrl + F5 ou Menu Depurar > Iniciar Sem Depuração
// Depurar programa: F5 ou menu Depurar > Iniciar Depuração

// Dicas para Começar: 
//   1. Use a janela do Gerenciador de Soluções para adicionar/gerenciar arquivos
//   2. Use a janela do Team Explorer para conectar-se ao controle do código-fonte
//   3. Use a janela de Saída para ver mensagens de saída do build e outras mensagens
//   4. Use a janela Lista de Erros para exibir erros
//   5. Ir Para o Projeto > Adicionar Novo Item para criar novos arquivos de código, ou Projeto > Adicionar Item Existente para adicionar arquivos de código existentes ao projeto
//   6. No futuro, para abrir este projeto novamente, vá para Arquivo > Abrir > Projeto e selecione o arquivo. sln
