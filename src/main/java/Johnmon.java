public class Johnmon extends Kaiju {

    public Johnmon(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public String monsterSays() {
        return "My name is John and I say Rawr";
    }


}

