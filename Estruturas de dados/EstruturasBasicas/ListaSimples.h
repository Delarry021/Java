#pragma once

template<typename T>
struct Node
{
	T dado = NULL;
	Node<T>* anterior = NULL;
};

template <typename T>
class ListaSimples
{
private:
	Node<T>* fim = NULL;
	Node<T>* inicio = NULL;
	int tamanho = 0;
	Node<T>* obterNo(int pos);

public:
	void adicionar(T dado);
	T remover(int pos);
	T removerUltimo();
	T obter(int pos);
	int getTamanho();
	ListaSimples();
	~ListaSimples();
};

#ifndef __LISTASIMPLES__
#define __LISTASIMPLES__
#include <iostream>

template<typename T>
Node<T>* ListaSimples<T>::obterNo(int pos)
{
	Node<T>* aux = NULL;
	if (pos >= 0 && pos < tamanho) {
		Node<T>* ptr = fim;
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
void ListaSimples<T>::adicionar(T dado)
{
	Node<T>* aux = new Node<T>();
	aux->dado = dado;
	aux->anterior = fim;
	if (inicio == NULL)
		inicio = aux;
	fim = aux;
	tamanho++;
}

template<typename T>
T ListaSimples<T>::obter(int pos)
{
	Node<T>* aux = obterNo(pos);
	return (aux == NULL) ? NULL : aux->dado;
}

template<typename T>
T ListaSimples<T>::remover(int pos)
{
	if (pos < tamanho && pos >= 0) {
		Node<T>* aux = obterNo(pos);
		Node<T>* posterior = obterNo(pos + 1);
		if (posterior != NULL)
			posterior->anterior = aux->anterior;
		if (pos == 0)
			inicio = posterior;
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
T ListaSimples<T>::removerUltimo()
{
	return remover(tamanho - 1);
}

template<typename T>
int ListaSimples<T>::getTamanho() {
	return tamanho;
}

template<typename T>
ListaSimples<T>::ListaSimples() {
	std::cout << "Lista Criada\n";
}

template<typename T>
ListaSimples<T>::~ListaSimples() {
	while (tamanho > 0)
		removerUltimo();
	std::cout << "Lista Removida\n";
}

#endif
