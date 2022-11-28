#pragma once
#include "ListaDupla.h"

template <typename T>
class ListaOrdenada:
	public ListaDupla<T>
{
protected:
	virtual int comparar(T dado1, T dado2) = 0;
public:
	virtual void adicionar(T dado);
	void imprimirValores();
};

#ifndef __LISTAORDENADA__
#define __LISTAORDENADA__
#include <iostream>
template<typename T>
void ListaOrdenada<T>::adicionar(T dado)
{
	DNode<T>* aux = new DNode<T>();
	aux->dado = dado;
	DNode<T>* sucessor = this->inicio;
	while (sucessor != NULL && comparar(aux->dado, sucessor->dado) < 0)
		sucessor = sucessor->posterior;
	if (sucessor != NULL) {
		aux->anterior = sucessor->anterior;
		sucessor->anterior = aux;
		aux->posterior = sucessor;
		if (aux->anterior != NULL)
			aux->anterior->posterior = aux;
		else
			this->inicio = aux;
	}
	else {
		if (this->fim != NULL) 
		{
			aux->anterior = this->fim;
			aux->anterior->posterior = aux;
			this->fim = aux;
		}
		else
			this->inicio = this->fim = aux;
	}
	this->tamanho++;
}

template<typename T>
void ListaOrdenada<T>::imprimirValores() 
{
	DNode<T>* aux = this->inicio;
	while(aux!=NULL){
	//for (int i = 0; i < this->tamanho; i++) {
		std::cout << aux->dado << "\n";
		aux = aux->posterior;
	}
}

#endif
