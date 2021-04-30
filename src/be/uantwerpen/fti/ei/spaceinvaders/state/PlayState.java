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
import java.util.ArrayList;
import java.util.Iterator;

public class PlayState extends GameState{
    private Sprite sprite;
    private Font font;
    AbstractFactory f= new J2dFactory();
    EnemyShip plane1=f.newEnemyShip();
    //EnemyShip[] enemys[];
    ArrayList<EnemyShip> horde=new ArrayList<EnemyShip>();
    boolean initialise=true;
    public PlayState(GameStateManager gsm){
        super(gsm);
        font= new Font("ZeldaFont.png",16,16);
        for(int j=0;j<4;j++){
            for (int i=0; i<10;i++)
            {
                horde.add(f.newEnemyShip());
                horde.get(horde.size()-1).setX(i);
                horde.get(horde.size()-1).setY(j);

            }
        }




    }


    public void update() {


    }


    public void input(KeyHandler Key) {
        if(Key.up.down){
            System.out.println("W is being pressed");
            plane1.setX(plane1.getX()+1);
        }
        if(Key.left.down){//this is A
            System.out.println("A is being pressed");
                plane1.setX(plane1.getX()-1);
        }
        if(Key.right.down){//this is d
            System.out.println("d is being pressed down");
        }
        if(Key.shoot.down){//this is space bar
            System.out.println("spacebar");

        }
    }


    public void render(Graphics2D g) {
        //Sprite.drawArray(g,font,"GAME OVER",new Vector2d(100,100),32,32,32,0);


            //Sprite.drawArray(g, plane1.giveBufferedImage(),plane1.getWidth(),plane1.getHeight(), plane1.getX()*plane1.getWidth(), plane1.getY()*plane1.getHeight());
        //for(int i=0;i<10;i++){
        //Sprite.drawArray(g, enemys[i].giveBufferedImage(),64,64, enemys[i].getX()*enemys[i].getWidth(), enemys[i].getY()*enemys[i].getHeight());
          //  System.out.println(enemys[i].getX());
        //}

        for(int i=0;i<horde.size();i++) {

                Sprite.drawArray(g, horde.get(i).giveBufferedImage(), horde.get(i).getWidthEnemyShip(), horde.get(i).getHeightEnemyship(), horde.get(i).getX() * horde.get(i).getWidth(), horde.get(i).getY() * horde.get(i).getHeight());
            }




    }
}
