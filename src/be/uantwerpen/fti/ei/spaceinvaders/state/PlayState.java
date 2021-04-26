package be.uantwerpen.fti.ei.spaceinvaders.state;

import be.uantwerpen.fti.ei.spaceinvaders.AbstractFactory;
import be.uantwerpen.fti.ei.spaceinvaders.entity.EnemyShip;
import be.uantwerpen.fti.ei.spaceinvaders.utils.KeyHandler;
import be.uantwerpen.fti.ei.spaceinvaders.font.Font;
import be.uantwerpen.fti.ei.spaceinvaders.utils.Vector2d;
import graphics.J2dEnemyShip;
import graphics.J2dFactory;
import graphics.Sprite;

import java.awt.*;

public class PlayState extends GameState{
    private Sprite sprite;
    private Font font;
    AbstractFactory f= new J2dFactory();
    EnemyShip plane1=f.newEnemyShip();

    public PlayState(GameStateManager gsm){
        super(gsm);
        font= new Font("ZeldaFont.png",16,16);

    }


    public void update() {

    }


    public void input(KeyHandler Key) {
        if(Key.up.down){
            System.out.println("W is being pressed");
            plane1.setX(plane1.getX()+1);
        }
        if(Key.left.down){//this is S
            System.out.println("S is being pressed");

        }
        if(Key.right.down){//this is d
            System.out.println("d is being pressed down");
        }
        if(Key.shoot.down){//this is space bar
            System.out.println("spacebar");

        }
    }


    public void render(Graphics2D g) {
        Sprite.drawArray(g,font,"GAME OVER",new Vector2d(100,100),32,32,32,0);


        Sprite.drawArray(g, plane1.giveBufferedImage(),plane1.getWidth(),plane1.getHeight(), plane1.getX()*160, plane1.getY()*90);
    }
}
