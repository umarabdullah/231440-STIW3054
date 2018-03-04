/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_01;

/**
 *
 * @author master lab
 */
public class MySleep extends Thread {

    public static void main(String[] args) {
        //new Thread(new MySleep()).start();
        System.out.println(MySleep.currentThread().getName());
        MyTest1 t1 = new MyTest1();
        t1.start();
        
        MyThreadThread t2 = new MyThreadThread();
        t2.start();
        //System.out.println(Thread.currentThread().getName());
        
    }

   
   
}