

public class Main {

    public static void main(String[] args) {

        Weapon weapon = new Weapon("type","name");
        Boss boss = new Boss();
        boss.setAttackType("attack");
        boss.setDamage(50);
        boss.setHealth(200);
        boss.setWeapon(weapon);
        System.out.println(boss.info());



    }



    }
