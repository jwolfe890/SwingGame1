package com.tutorial.main;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable {

    public static final long serialVersionUID = 5499091263677576588L;

    public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;

    public Game() {
        new Window(WIDTH, HEIGHT, "Let's Build a Game!", this);
    }


    public synchronized void start() {

    }

    public void run() {

    }

    public static void main (String args[]) {
        new Game();
    }

}
