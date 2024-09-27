package ru.mpei.l5.ifaces;

public class Main {
    public static void main(String[] args) {
        Movable[] enemies = new Movable[2];
        enemies[0] = new AngryBirdNPC();
        enemies[1] = new EnemySharkNpc();

        Movable enemy = enemies[1];
        enemy.spawn(10,20);

    }
}
