package be.uantwerpen.fti.ei.spaceinvaders;
import be.uantwerpen.fti.ei.spaceinvaders.state.GameState;
import be.uantwerpen.fti.ei.spaceinvaders.state.GameStateManager;
import be.uantwerpen.fti.ei.spaceinvaders.utils.KeyHandler;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel implements Runnable {
    public static int width;
    public static int height;

    private Thread thread;
    private boolean running=false;
    private int x=0;

    private BufferedImage img;
    private Graphics2D g;

    private KeyHandler key;

    private GameStateManager gsm;

    public GamePanel(int width, int height) {
        this.width=width;
        this.height=height;

        setPreferredSize(new Dimension(width, height));
        setFocusable(true);
        requestFocus();
    }

    public void addNotify(){
        super.addNotify();
        if(thread==null)
        {
            thread =new Thread(this,"gamethread");
            thread.start();
        }
    }
    public void init(){
    running=true;
    img= new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
    g=(Graphics2D) img.getGraphics();

    key=new KeyHandler(this);

    gsm= new GameStateManager();
    }




    public void run(){
        init();
        final double GAME_HERTZ=2;
        final double TBU= 2_00_000_000 /GAME_HERTZ;//time before update

        final int MUBR=1; //most updates before render

        double lastUpdateTime=System.nanoTime();
        double lastRenderTime;

        final double TARGET_FPS=30;
        final double TTBR=1000000000/TARGET_FPS;//total time before render

        int frameCount=0;
        int lastSecondTime=(int) (lastUpdateTime/1000000000);
        int oldFrameCount=0;


        while(running){
            double now=System.nanoTime();
            int updateCount=0;



            while((now-lastUpdateTime)>TBU&&(updateCount<MUBR)){
                update();
                input(key);
                lastUpdateTime+=TBU;
                updateCount++;
            }
            if(now-lastUpdateTime>TBU){
                lastUpdateTime=now-TBU;
            }

            render();
            draw();
            lastRenderTime=now;
            frameCount++;

            int thisSecond=(int) (lastUpdateTime/1000000000);
            if(thisSecond>lastSecondTime){
                if(frameCount!=oldFrameCount){
                    System.out.println("NEW SECOND "+thisSecond+" "+frameCount);
                    oldFrameCount=frameCount;
                }
                frameCount=0;
                lastSecondTime=thisSecond;
            }

            while(now-lastRenderTime<TTBR&& now-lastUpdateTime<TBU){
                Thread.yield();
                try{
                Thread.sleep(1);
                }catch(Exception e){
                    System.out.println("Error yielding thread");
                }
                now=System.nanoTime();
            }

        }
    }
    public void update(){
        gsm.update();

    }

    public void input(KeyHandler key){
        gsm.input(key);
    }

    public void render(){
    if(g!=null)
    {
        g.setColor(new Color(0, 0, 0));
        g.fillRect(0,0,width,height);
        gsm.render(g);
    }
    }
    public void draw(){
        Graphics g2=(Graphics) this.getGraphics();
        g2.drawImage(img, 0,0,width,height,null);
        g2.dispose();
    }

}
