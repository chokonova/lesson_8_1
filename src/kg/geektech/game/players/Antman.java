package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Antman extends Hero{

    public Antman(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.INCREASE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean ut = RPG_Game.random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (ut == true){
                heroes[6].setHealth(heroes[6].getHealth() + 50);
                heroes[6].setDamage(heroes[6].getDamage() + 50);
                System.out.println("Увеличелся");
                break;
            }else {
                heroes[6].setHealth(getHealth() - 50);
                heroes[6].setDamage(getDamage() - 50);
                System.out.println("Уменьшился");
            break;
            }
        }
    }
}
