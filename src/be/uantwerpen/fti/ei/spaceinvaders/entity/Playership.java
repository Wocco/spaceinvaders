package be.uantwerpen.fti.ei.spaceinvaders.entity;

abstract public class Playership extends PlayerEntity{
    private boolean visible;
    private boolean dying;
    private int health;

    public int getHealth(){return health;}
    public void playerHit(){
        if(this.health==1){
            this.health=0;
            dying=true;
        }
        else{
            this.health--;
        }

    }
    public void setHealth(int health){
        this.health=health;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isDying() {
        return dying;
    }

    public void setDying(boolean dying) {
        this.dying = dying;
    }
    abstract public int getWidthPlayerShip();
    abstract public int getHeightPlayerShip();
    abstract public void visualize() ;
}
