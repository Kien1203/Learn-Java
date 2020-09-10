/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.lession4;

/**
 *
 * @author ACER
 */
public class ThreadOne extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1 > " + i);
        }
    }
    
    
}
