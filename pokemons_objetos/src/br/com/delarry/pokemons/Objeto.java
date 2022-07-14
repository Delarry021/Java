package br.com.delarry.pokemons;

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

}
