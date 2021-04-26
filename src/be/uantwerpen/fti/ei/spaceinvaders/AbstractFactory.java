package be.uantwerpen.fti.ei.spaceinvaders;

import be.uantwerpen.fti.ei.spaceinvaders.entity.EnemyShip;
import graphics.J2dEnemyShip;
import graphics.J2dFactory;

//abstract factorie maakt factories
public abstract class AbstractFactory {
    public abstract EnemyShip newEnemyShip();
}
