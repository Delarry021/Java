package br.com.delarry.pokemons;

public class pokemon {
    public static void main(String[] args) {

        Objeto charmander = new Objeto();
        Objeto squirtle = new Objeto();
        Objeto bulbasaur = new Objeto();

        bulbasaur.setDexNumber(4);
        bulbasaur.setName("Bulbasaur");
        bulbasaur.setType("Grass");
        bulbasaur.setHp(3);
        bulbasaur.setAtk(3);
        bulbasaur.setDef(3);
        bulbasaur.setSpAtk(4);
        bulbasaur.setSpDef(4);
        bulbasaur.setSpe(3);

        charmander.setDexNumber(4);
        charmander.setName("Charmander");
        charmander.setType("Fire");
        charmander.setHp(3);
        charmander.setAtk(4);
        charmander.setDef(3);
        charmander.setSpAtk(4);
        charmander.setSpDef(3);
        charmander.setSpe(4);

        squirtle.setDexNumber(7);
        squirtle.setName("Squirtle");
        squirtle.setType("Water");
        squirtle.setHp(3);
        squirtle.setAtk(3);
        squirtle.setDef(4);
        squirtle.setSpAtk(3);
        squirtle.setSpDef(4);
        squirtle.setSpe(3);

        System.out.println(charmander.getName() + ":");
        System.out.println("Número na dex: " + charmander.getDexNumber());
        System.out.println("Tipo: " + charmander.getType());
        System.out.println("HP: " + charmander.getHp());
        System.out.println("ATK: " + charmander.getAtk());
        System.out.println("DEF: " + charmander.getDef());
        System.out.println("SPATK: " + charmander.getSpAtk());
        System.out.println("SPDEF: " + charmander.getSpDef());
        System.out.println("SPEED: " + charmander.getSpe());

        System.out.println("");

        System.out.println(squirtle.getName() + ":");
        System.out.println("Número na dex: " + squirtle.getDexNumber());
        System.out.println("Tipo: " + squirtle.getType());
        System.out.println("HP: " + squirtle.getHp());
        System.out.println("ATK: " + squirtle.getAtk());
        System.out.println("DEF: " + squirtle.getDef());
        System.out.println("SPATK: " + squirtle.getSpAtk());
        System.out.println("SPDEF: " + squirtle.getSpDef());
        System.out.println("SPEED: " + squirtle.getSpe());

        System.out.println("");

        System.out.println(bulbasaur.getName() + ":");
        System.out.println("Número na dex: " + bulbasaur.getDexNumber());
        System.out.println("Tipo: " + bulbasaur.getType());
        System.out.println("HP: " + bulbasaur.getHp());
        System.out.println("ATK: " + bulbasaur.getAtk());
        System.out.println("DEF: " + bulbasaur.getDef());
        System.out.println("SPATK: " + bulbasaur.getSpAtk());
        System.out.println("SPDEF: " + bulbasaur.getSpDef());
        System.out.println("SPEED: " + bulbasaur.getSpe());
    }
}
