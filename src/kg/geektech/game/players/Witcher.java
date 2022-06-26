package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Witcher extends Hero{
    public Witcher(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.DONATE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
boolean shans = RPG_Game.random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (shans == true){
                if (heroes[i].getHealth() <= 0){
                    heroes[i].setHealth(heroes[5].getHealth() + heroes[i].getHealth());
                    heroes[5].setHealth(0);
                    System.out.println("пожертвовал");
break;
                }
            }else {
                heroes[5].setHealth(heroes[5].getHealth());
                System.out.println("остался жив");
                break;
            }

        }
    }
}
