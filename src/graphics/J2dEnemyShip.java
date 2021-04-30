package graphics;

import be.uantwerpen.fti.ei.spaceinvaders.entity.EnemyShip;
import be.uantwerpen.fti.ei.spaceinvaders.font.Font;
import be.uantwerpen.fti.ei.spaceinvaders.utils.Vector2d;

import java.awt.image.BufferedImage;
import java.nio.Buffer;

public class J2dEnemyShip extends EnemyShip {
    int width=64;
    int height=64;
    int widthEnemyShip=54;
    int heightEnemyship=54;
    Sprite sprite = new Sprite("alien.png", widthEnemyShip, heightEnemyship);




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
    public int getWidthEnemyShip(){
        return widthEnemyShip;
    }
    public int getHeightEnemyship(){
        return heightEnemyship;
    }



    public void setWidth(int newWidth){
        this.width=newWidth;
    }
    public void setHeight(int newHeight){
        this.height=newHeight;
    }
    public void setwidthEnemyShip(int widthEnemyShip){
        this.widthEnemyShip=widthEnemyShip;
    }
    public void setheightEnemyship(int heightEnemyship){
        this.heightEnemyship=heightEnemyship;
    }


    public BufferedImage giveBufferedImage(){
        BufferedImage bufferedImage=null;
        return bufferedImage=sprite.loadSprite("alien.png");
    }
}
