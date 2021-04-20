package be.uantwerpen.fti.ei.spaceinvaders.entity;

public abstract class EnemyEntity extends Entity {
    int direction=0;
    @Override
    public String getEntity() {
        return "EnemyEntity";
    }
    @Override
    public int getDirection(){
        return direction;
    }
    abstract public void visualize() ;
}
