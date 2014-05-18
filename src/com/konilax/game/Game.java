package com.konilax.game;

import com.konilax.engine.handlers.Input;
import org.lwjgl.input.Keyboard;

public class Game {

    public Game() {

    }

    public void input() {
        if(Input.getKeyDown(Keyboard.KEY_UP))
            System.out.println("We've just pressed up!");
        if(Input.getKeyUp(Keyboard.KEY_UP))
            System.out.println("We've just released up!");
        if(Input.getMouseDown(1))
            System.out.println("We've just right clicked at " + Input.getMousePosition().toString());
        if(Input.getMouseUp(1))
            System.out.println("We've just released mouse button at " + Input.getMousePosition().toString());
    }

    public void update() {

    }

    public void render() {

    }

}
