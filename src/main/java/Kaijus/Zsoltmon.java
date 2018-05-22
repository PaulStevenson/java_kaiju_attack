package Kaijus;

public class Zsoltmon extends Kaiju {

    public Zsoltmon(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public String monsterSays() {
        return "Yada Yada Yada";
    }

}
