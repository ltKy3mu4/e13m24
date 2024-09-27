package ru.mpei.l5.ifaces;

public class EnemySharkNpc implements Movable {
    private int currentX, currentY;
    private double speed = 10.2;
    private boolean isAlive = false;
    @Override
    public void go(int x, int y) {
        this.currentX += x / 10.2;
        this.currentY += y / 10.2;
    }

    @Override
    public void spawn(int x, int y) {
        this.currentX = x;
        this.currentY = y;
        this.isAlive = true;
    }


}
