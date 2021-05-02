package graphics;

import be.uantwerpen.fti.ei.spaceinvaders.entity.Playership;

import java.awt.image.BufferedImage;

public class J2dPlayerShip extends Playership {
    int width=64;
    int height=64;
    int widthPlayerShip=62;
    int heightPlayerShip=62;
    Sprite sprite = new Sprite("player.png", widthPlayerShip, heightPlayerShip);




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
    public int getWidthPlayerShip(){
        return widthPlayerShip;
    }
    public int getHeightPlayerShip(){
        return heightPlayerShip;
    }



    public void setWidth(int newWidth){
        this.width=newWidth;
    }
    public void setHeight(int newHeight){
        this.height=newHeight;
    }
    public void setwidthPlayerShip(int widthPlayerShip){
        this.widthPlayerShip=widthPlayerShip;
    }
    public void setheightPlayerShip(int heightPlayerShip){
        this.heightPlayerShip=heightPlayerShip;
    }


    public BufferedImage giveBufferedImage(){
        BufferedImage bufferedImage=null;
        return bufferedImage=sprite.loadSprite("player.png");
    }



}
