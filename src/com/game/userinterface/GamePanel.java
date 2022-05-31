/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.game.userinterface;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

/**
 *
 * @author VIP
 */
public class GamePanel extends JPanel implements Runnable, KeyListener{
    
    private Thread thread;
    
    private boolean isRunning;
    
    public GamePanel() {
        
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(0, 0, GameFrame.SCREEN_WIDTH, GameFrame.SCREEN_HEIGHT);
    }
    
    public void startGame() {
        if(thread == null) {
            isRunning = true;
            thread = new Thread(this);
            thread.start();
        }
    }

    @Override
    public void run() {
        long FPS = 80;
        long period = 1000*1000000 / FPS;
        long beginTime;
        long sleepTime;
        
        int a = 1;
        beginTime = System.nanoTime();
        while(isRunning) {
//            System.out.println("a = " + (a++));
            // Update
            // Render
            
            long deltaTime = System.nanoTime() - beginTime;
            sleepTime = period - deltaTime;
            try {
                if(sleepTime > 0) {
                    Thread.sleep(sleepTime/1000000);
                } else {
                    Thread.sleep(period/2000000);
                }
                
            } catch (InterruptedException ex) {}
            
            beginTime = System.nanoTime();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Enter keyPressed");
        if(e.getKeyCode() == KeyEvent.VK_A) {
            System.out.println("You Pressed A");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Enter keyReased");
    }
    
}
