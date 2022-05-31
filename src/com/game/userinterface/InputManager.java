/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.game.userinterface;

import java.awt.event.KeyEvent;

/**
 *
 * @author VIP
 */
public class InputManager {
    public void processKeyPressed(int keyCode) {
        switch(keyCode) {
            case KeyEvent.VK_UP:
                System.out.println("You pressed up");
                break;
            
            case KeyEvent.VK_DOWN:
                System.out.println("You pressed down");
                break;
            
            case KeyEvent.VK_LEFT:
                System.out.println("You pressed left");
                break;
                
            case KeyEvent.VK_RIGHT:
                System.out.println("You pressed right");
                break;
                
            case KeyEvent.VK_ENTER:
                System.out.println("You pressed enter");
                break;
                
            case KeyEvent.VK_SPACE:
                System.out.println("You pressed space");
                break;
                
            case KeyEvent.VK_A:
                System.out.println("You pressed A");
                break;
        }
    }
}
