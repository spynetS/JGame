package Testing;

import JavaGameEngine.Backend.ComponentHandler;
import JavaGameEngine.Components.GameObject;
import JavaGameEngine.Components.Ui.Label;
import JavaGameEngine.JavaGameEngine;
import JavaGameEngine.msc.Vector2;

import javax.swing.*;
import java.awt.*;

public class Main extends JavaGameEngine{

    public static void main(String[] args){

        init();

        Player s = new Player(new Vector2(10,10));
        ComponentHandler.addObject(s);
        JFrame frame = new JFrame();
        frame.setTitle("My example Title");

        Ground ground = new Ground();
        ComponentHandler.addObject(ground);


        ComponentHandler.addObject(new Coin());


        start();
    }

}
