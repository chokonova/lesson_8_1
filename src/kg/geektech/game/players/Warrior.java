package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Warrior extends Hero {
    public Warrior(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int random_damage = RPG_Game.random.nextInt(5)+1;
        for (int i = 0; i < heroes.length; i++) {
            boss.setHealth(boss.getHealth() - heroes[0].getDamage() * random_damage);
            System.out.println("Крит");
            break;
        }
    }
}
