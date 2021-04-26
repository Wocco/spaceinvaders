package graphics;

import be.uantwerpen.fti.ei.spaceinvaders.AbstractFactory;

public class J2dFactory extends AbstractFactory {
    public J2dEnemyShip newEnemyShip(){
        return new J2dEnemyShip();
    };
}
