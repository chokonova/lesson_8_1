package kg.geektech.game.players;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int damage = boss.getDamage() / 2;
        boss.setHealth(boss.getHealth() - (damage + heroes[3].getDamage()));
        System.out.println("забрал урон боссса");

    }
}
