package abstractclass.gamecharacter;

//fight
//oneHit
public class BattleField {
    private int round;

    public Character fight(Character one, Character other){
        boolean isBothAlive = one.isAlive() && other.isAlive();
        boolean isOneAtaccker = true;
        while(isBothAlive){
            if (isOneAtaccker){
                isBothAlive = oneHit(one,other);
            }else{
                isBothAlive = oneHit(other,one);
            }
            isOneAtaccker=!isOneAtaccker;
            round++;
        }

        if (one.isAlive()){
            return one;
        }else{
            return other;
        }
    }

    public int getRound() {
        return round;
    }
    private boolean oneHit(Character attacker, Character defender){
        if (attacker.isAlive() && defender.isAlive()) {
            attacker.primaryAttack(defender);
            attacker.secondaryAttack(defender);
        }
        return attacker.isAlive() && defender.isAlive();
    }
}
