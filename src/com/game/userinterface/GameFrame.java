/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.game.userinterface;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author VIP
 */
public class GameFrame extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static final int SCREEN_WIDTH = 1000;
    public static final int SCREEN_HEIGHT = 600;
    
    GamePanel gamePanel;
    
    public GameFrame() {
        super("Mega Man java game");
        Toolkit toolkit = this.getToolkit();
        Dimension solution = toolkit.getScreenSize();
        
        this.setBounds((solution.width - SCREEN_WIDTH)/2, (solution.height - SCREEN_HEIGHT)/2, SCREEN_WIDTH, SCREEN_HEIGHT);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gamePanel = new GamePanel();
        add(gamePanel);
        
        this.addKeyListener(gamePanel);
    }
    
    public void startGame() {
        gamePanel.startGame();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        GameFrame gameFrame = new GameFrame();
        gameFrame.setVisible(true);
        gameFrame.startGame();
    }
    
}
