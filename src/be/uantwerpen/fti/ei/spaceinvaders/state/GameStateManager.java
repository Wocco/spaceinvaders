package be.uantwerpen.fti.ei.spaceinvaders.state;

import be.uantwerpen.fti.ei.spaceinvaders.utils.KeyHandler;

import java.awt.*;
import java.util.ArrayList;

public class GameStateManager {
    private ArrayList<GameState> states;
    public GameStateManager(){
        states = new ArrayList<GameState>();

        states.add(new PlayState(this));
    }
    public void update(){
        for(int i=0;i< states.size();i++)
        {
            states.get(i).update();
        }
    }
    public void input(KeyHandler key){
        for(int i=0;i< states.size();i++)
        {
            states.get(i).input(key);
        }
    }
    public void render(Graphics2D g){
        for(int i=0;i< states.size();i++)
        {
            states.get(i).render(g);
        }
    }
}
