package kg.geektech.game.players;

public class Hacker extends Hero{
    public Hacker(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.HACK);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int health = boss.setHealth(boss.getHealth()- 950);
        for (int i = 0; i < heroes.length; i++) {
     heroes[i].setHealth(heroes[i].getHealth() + health);
            System.out.println("хакнул босса");
break;
        }
    }
}
