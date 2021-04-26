package graphics;

import be.uantwerpen.fti.ei.spaceinvaders.entity.EnemyShip;
import be.uantwerpen.fti.ei.spaceinvaders.font.Font;
import be.uantwerpen.fti.ei.spaceinvaders.utils.Vector2d;

import java.awt.image.BufferedImage;
import java.nio.Buffer;

public class J2dEnemyShip extends EnemyShip {
    Sprite sprite = new Sprite("alien.png", 16, 16);
    int width=160;
    int height=90;


    @Override
    public void visualize() {
        //Sprite sprite = new Sprite("alien.png", 16, 16);
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    public void setWidth(int newWidth){
        this.width=newWidth;
    }
    public void setHeight(int newHeight){
        this.height=newHeight;
    }

    public Sprite giveSprite(){
        return sprite = new Sprite("alien.png", 16, 16);
    }
    public BufferedImage giveBufferedImage(){
        BufferedImage bufferedImage=null;
        return bufferedImage=sprite.loadSprite("alien.png");
    }
}
