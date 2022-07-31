package br.com.delarry.pokemons;

import java.util.Scanner;

public class Objeto {

    int dexnumber;
    double hp,spatk,atk,spdef,def,spe;
    String name,type;

    //Methods

    //GET

    public int getDexNumber() {
        return dexnumber;
    }

    public double getHp() {
        return hp;
    }

    public double getSpAtk() {
        return spatk;
    }

    public double getAtk() {
        return atk;
    }

    public double getSpDef() {
        return spdef;
    }

    public double getDef() {
        return def;
    }

    public double getSpe() {
        return spe;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    //SET

    public void setDexNumber(int dex) {
        dexnumber = dex;
    }

    public void setHp(double hpp) {
        hp = hpp;
    }

    public void setSpAtk(double spatkp) {
        spatk = spatkp;
    }

    public void setAtk(double atkp) {
        atk = atkp;
    }

    public void setSpDef(double spdefp) {
        spdef = spdefp;
    }

    public void setDef(double defp) {
        def = defp;
    }

    public void setSpe(double spep) {
        spe = spep;
    }

    public void setName(String namep) {
        name = namep;
    }

    public void setType(String typep) {
        type = typep;
    }

    //CONSTRUTORES

    public Objeto() {}
    public Objeto(int dex,double hpp,double spatkp,double atkp,double spdefp,double defp, double spep, String namep, String typep){}
    public Objeto(int dex,double spatkp,double atkp,double spdefp,double defp, double spep, String namep, String typep){}
    public Objeto(int dex,double atkp,double spdefp,double defp, double spep, String namep, String typep){}
    public Objeto(int dex,double spdefp,double defp, double spep, String namep, String typep){}
    public Objeto(int dex,double defp, double spep, String namep, String typep){}
    public Objeto(int dex,double spep, String namep, String typep){}
    public Objeto(int dex,String namep, String typep){}
    public Objeto(int dex,String typep){}
    public Objeto(int dex){}

    //FUNCOES AUXILIARES

    public void Entrada()
    {

        Scanner ent = new Scanner(System.in);

        System.out.println("Entre com o numero da dex: ");
        setDexNumber(Integer.parseInt(ent.nextLine()));
        System.out.println("Entre com o nome:");
        setName(ent.nextLine());
        System.out.println("Entre com o tipo: ");
        setType(ent.nextLine());
        System.out.println("Entre com o HP: ");
        setHp(Double.parseDouble(ent.nextLine()));
        System.out.println("Entre com o ATK: ");
        setAtk(Double.parseDouble(ent.nextLine()));
        System.out.println("Entre com a DEF: ");
        setDef(Double.parseDouble(ent.nextLine()));
        System.out.println("Entre com o SPATK: ");
        setSpAtk(Double.parseDouble(ent.nextLine()));
        System.out.println("Entre com a SPDEF: ");
        setSpDef(Double.parseDouble(ent.nextLine()));
        System.out.println("Entre com a SPEED: ");
        setSpe(Double.parseDouble(ent.nextLine()));
    }

    public void Imprimir()
    {
        System.out.println("Número na dex: " + getDexNumber());
        System.out.println("Tipo: " + getType());
        System.out.println("HP: " + getHp());
        System.out.println("ATK: " + getAtk());
        System.out.println("DEF: " + getDef());
        System.out.println("SPATK: " + getSpAtk());
        System.out.println("SPDEF: " + getSpDef());
        System.out.println("SPEED: " + getSpe());
        System.out.println("");
    }

}