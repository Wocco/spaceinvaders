package be.uantwerpen.fti.ei.spaceinvaders.entity;

abstract public class PlayerEntity extends Entity{
    int direction=0;
    @Override
    public String getEntity() {
        return "PlayerEntity";
    }
    @Override
    public int getDirection(){
        return direction;
    }

    abstract public void visualize() ;

}
