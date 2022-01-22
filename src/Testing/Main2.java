package Testing;

import Main.Main;
import Main.Msc.ObjectHandler;
import Main.Msc.Vector2;
import Testing.*;

import javax.swing.*;

public class Main2 {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setTitle("Test");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Main.DELAY=10;
        ObjectHandler.AddObject(new Player(new Vector2(200,200)));
        ObjectHandler.AddObject(new pillor(new Vector2(700,150)));
        ObjectHandler.AddObject(new pillor(new Vector2(400,500)));

        Main.Start(frame);
    }

    public static void restart()
    {
        //Set random y on pillars

        ObjectHandler.getObjects().get(0).setPosition(new Vector2(200,200));
        ObjectHandler.getObjects().get(1).setPosition(new Vector2(700,150));
        ObjectHandler.getObjects().get(2).setPosition(new Vector2(700,500));

    }

}
