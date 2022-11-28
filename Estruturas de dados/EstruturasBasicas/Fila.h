#pragma once
#include "ListaDupla.h"
template<typename T>
class Fila :
    private ListaDupla<T>
{
public:
    void enviar(T dado);
    T receber();
};

#ifndef __FILA__
#define __FILA__
template<typename T>
void Fila<T>::enviar(T dado)
{
    ListaDupla<T>::adicionar(dado);
}

template<typename T>
T Fila<T>::receber()
{
    return ListaDupla<T>::remover(0);
}
#endif


