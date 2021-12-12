package abstractclass.gamecharacter;

import java.util.Random;
// static attributumok
public abstract class Character {
    private static final int MAX_DAMAGE = 10;
    private static final int MAX_DEFENCE = 5;
    private  int hitPoint =100;
    private Point position;
    private Random random;

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }
    protected int getActualPrimaryDamage(){
        return random.nextInt(1,MAX_DAMAGE+1);
    }
    protected void hit(Character enemy,int damage){
        int actualDefence=enemy.getActualDefence();
        if (actualDefence<damage){
            enemy.decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character enemy){
        hit(enemy,getActualPrimaryDamage());
    }
    public abstract void secondaryAttack(Character enemy);

    public int getHitPoint() {
        return hitPoint;
    }

    public Point getPosition() {
        return position;
    }

    public Random getRandom() {
        return random;
    }
    public boolean isAlive(){
        return hitPoint>0;
    }
    private int getActualDefence(){
        return random.nextInt(1,MAX_DEFENCE+1);
    }
    private void decreaseHitPoint(int diff){
        hitPoint-=diff;
    }
}
