#pragma once

template<typename T>
struct DNode
{
	T dado = NULL;
	DNode<T>* anterior = NULL;
	DNode<T>* posterior = NULL;
};

template <typename T>
class ListaDupla
{
protected:
	DNode<T>* fim = NULL;
	DNode<T>* inicio = NULL;
	int tamanho = 0;
	DNode<T>* obterNo(int pos);

public:
	virtual void adicionar(T dado);
	T remover(int pos);
	T removerUltimo();
	T obter(int pos);
	int getTamanho();
	ListaDupla();
	~ListaDupla();
};

#ifndef __LISTADUPLA__
#define __LISTADUPLA__
#include <iostream>

template<typename T>
DNode<T>* ListaDupla<T>::obterNo(int pos)
{
	DNode<T>* aux = NULL;
	if (pos >= 0 && pos < tamanho) {
		DNode<T>* ptr = fim;
		for (int i = tamanho - 1; i >= 0; i--, ptr = ptr->anterior) {
			if (i == pos) {
				aux = ptr;
				break;
			}
		}
	}
	return aux;
}

template<typename T>
void ListaDupla<T>::adicionar(T dado)
{
	DNode<T>* aux = new DNode<T>();
	aux->dado = dado;
	aux->anterior = fim;
	if (inicio == NULL)
		inicio = aux;
	if (fim != NULL)
		fim->posterior = aux;
	fim = aux;
	tamanho++;
}

template<typename T>
T ListaDupla<T>::obter(int pos)
{
	DNode<T>* aux = obterNo(pos);
	return (aux == NULL) ? NULL : aux->dado;
}

template<typename T>
T ListaDupla<T>::remover(int pos)
{
	if (pos < tamanho && pos >= 0) {
		DNode<T>* aux = obterNo(pos);
		if (aux->posterior != NULL)
			aux->posterior->anterior = aux->anterior;
		if (aux->anterior != NULL)
			aux->anterior->posterior = aux->posterior;
        if (pos == 0)
			inicio = aux->posterior;
		if (pos == tamanho - 1)
			fim = aux->anterior;
		tamanho--;
		T dado = aux->dado;
		delete aux;
		return dado;
	}
	else
		return NULL;
}

template<typename T>
T ListaDupla<T>::removerUltimo()
{
	return remover(tamanho - 1);
}

template<typename T>
int ListaDupla<T>::getTamanho() {
	return tamanho;
}

template<typename T>
ListaDupla<T>::ListaDupla() {
	std::cout << "Lista Criada\n";
}

template<typename T>
ListaDupla<T>::~ListaDupla() {
	while (tamanho > 0)
		remover(tamanho - 1);
	std::cout << "Lista Removida\n";
}

#endif

