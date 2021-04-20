package be.uantwerpen.fti.ei.spaceinvaders.state;

import be.uantwerpen.fti.ei.spaceinvaders.utils.KeyHandler;

import java.awt.*;

public abstract class GameState {
    private GameStateManager gsm;
    public GameState(GameStateManager gsm){
        this.gsm=gsm;
    }

    public abstract void update();
    public abstract void input(KeyHandler Key);
    public abstract void render(Graphics2D g);
}
