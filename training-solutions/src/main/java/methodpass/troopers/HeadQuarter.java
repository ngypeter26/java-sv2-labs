package methodpass.troopers;

import java.util.List;

public class HeadQuarter {
    private List<Trooper> troopers;


    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
        if (trooper == null){
            throw new IllegalArgumentException("Trooper must not be null.");
        }
        troopers.add(trooper);
    }
    public void moveTrooperByName(String name, Position target){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Name must not be empty.");
        }else if (target == null){
            throw new IllegalArgumentException("The new position must not be null");
        }
        findTrooperByName(name).changePosition(target);
    }
    public void moveClosestTrooper(Position target){
        if (target == null){
            throw new IllegalArgumentException("The new position must not be null");
        }else {
            findClosestTrooper(target).changePosition(target);
        }

    }
    private Trooper findTrooperByName(String name){
        for (Trooper trooper : troopers){
            if (trooper.getName().equals(name)){
                return trooper;
            }
        }
        return null;
    }
    private Trooper findClosestTrooper(Position target){
        Trooper closest = troopers.get(0);
        for (Trooper trooper : troopers){
            if (closest.distanceFrom(target)>trooper.distanceFrom(target)){
                closest = trooper;
            }
        }
        return closest;
    }
    private void moveTrooper(Trooper trooper,Position target){
        trooper.changePosition(target);
    }
}
