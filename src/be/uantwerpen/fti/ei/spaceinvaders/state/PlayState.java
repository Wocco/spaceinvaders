package be.uantwerpen.fti.ei.spaceinvaders.state;

import be.uantwerpen.fti.ei.spaceinvaders.utils.KeyHandler;

import java.awt.*;

public class PlayState extends GameState{
    public PlayState(GameStateManager gsm){
        super(gsm);
    }


    public void update() {

    }


    public void input(KeyHandler Key) {

    }


    public void render(Graphics2D g) {
        g.setColor(Color.red);
        g.fillRect(100,100,64,64);
    }
}
