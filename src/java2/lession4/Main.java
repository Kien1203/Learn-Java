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
public class Main {
    public static void main (String[] args){
        System.out.println("start");
        
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Thread 1 > " + i);
                }
            }
        });
        t.start();
        
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Thread 2 > " + i);
                }
            }
        });
        t2.start();
        
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Thread 2 > " + i);
                }
            }
        });
        t3.start();
        System.out.println("end");
    }
    
}
