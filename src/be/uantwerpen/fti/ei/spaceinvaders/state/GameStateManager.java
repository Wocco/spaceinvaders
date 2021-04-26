package be.uantwerpen.fti.ei.spaceinvaders.state;

import be.uantwerpen.fti.ei.spaceinvaders.GamePanel;
import be.uantwerpen.fti.ei.spaceinvaders.utils.KeyHandler;
import be.uantwerpen.fti.ei.spaceinvaders.utils.Vector2d;

import java.awt.*;
import java.util.ArrayList;

public class GameStateManager {
    private ArrayList<GameState> states;

    public static Vector2d map;

    public static final int PLAY=0;
    public static final int MENU=1;
    public static final int PAUSE=2;
    public static final int GAMEOVER=3;

    public GameStateManager(){
        map=new Vector2d(GamePanel.width,GamePanel.height);//create a vector
        Vector2d.setWorldVar(map.x, map.y);//set the world
        states = new ArrayList<GameState>();

        states.add(new PlayState(this));
    }


    public void pop(int state){
    states.remove(state);
    }

    public void add(int state){
        if(state==PLAY){
            states.add(new PlayState(this));

        }
        if(state==MENU){
            states.add(new MenuState(this));
        }
        if(state==PAUSE){
            states.add(new PauseState(this));
        }
        if(state==GAMEOVER){
            states.add(new GameOverState(this));
        }
    }


    public void addAndPop(int state){
        states.remove(0);
        add(state);
    }


    public void update(){
        for(int i=0;i< states.size();i++)
        {
            Vector2d.setWorldVar(map.x, map.y);
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
