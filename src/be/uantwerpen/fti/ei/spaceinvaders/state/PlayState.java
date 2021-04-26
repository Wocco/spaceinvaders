package be.uantwerpen.fti.ei.spaceinvaders.state;

import be.uantwerpen.fti.ei.spaceinvaders.AbstractFactory;
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


    public PlayState(GameStateManager gsm){
        super(gsm);
        font= new Font("ZeldaFont.png",16,16);


        sprite=new Sprite("alien.png",16,16);

    }


    public void update() {

    }


    public void input(KeyHandler Key) {
        if(Key.up.down){
            System.out.println("W is being pressed");

        }
    }


    public void render(Graphics2D g) {
        Sprite.drawArray(g,font,"GAME OVER",new Vector2d(100,100),32,32,32,0);
        J2dFactory factory= new J2dFactory();
        J2dEnemyShip plane1=factory.newEnemyShip();
        Sprite.drawArray(g, plane1.giveBufferedImage(),32,32,32,0);
    }
}
