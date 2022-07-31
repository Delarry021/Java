package br.com.delarry.pokemons;

import java.util.Scanner;

public class Pokemon extends Objeto{
    String habilidade_esp;

    public void setHabilidade_esp(String h) {
        habilidade_esp = h;
    }

    public String getHabilidade_esp() {
        return habilidade_esp;
    }

    public Pokemon(){}
    public Pokemon(String h){
        super();
    }

    public void Entrada()
    {

        Scanner ent = new Scanner(System.in);

        super.Entrada();
        System.out.println("Entre com a habilidade especial: ");
        setHabilidade_esp(ent.nextLine());
    }

    public void Imprimir()
    {
        super.Imprimir();
        System.out.println("Habilidade: " + getHabilidade_esp());
    }
}
