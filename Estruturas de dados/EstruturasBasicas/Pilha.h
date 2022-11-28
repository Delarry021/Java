#pragma once
#include "ListaSimples.h"
template<typename T>
class Pilha :
    private ListaSimples<T>
{
public:
    void empilhar(T dado);
    T desempilhar();
};

#ifndef __PILHA__
#define __PILHA__
template<typename T>
void Pilha<T>::empilhar(T dado)
{
    ListaSimples<T>::adicionar(dado);
}

template<typename T>
T Pilha<T>::desempilhar()
{
    return ListaSimples<T>::removerUltimo();
}
#endif


