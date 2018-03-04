/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_01;

import static java.lang.Thread.sleep;

/**
 *
 * @author master lab
 */
public class MyTest1 extends Thread {
    public void run() {
        try {
            //String j="";
            Thread.currentThread().setName("Thread-x");
            System.out.println(Thread.currentThread().getName());
            for (int x = 0; x < 10; x++) {
//                if(((x%5)==0)&&(x!=0)){
//                j=x+"A";
//                System.out.println(j);
//                }
//                else{
                System.out.println(x);//}
                sleep(2000);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
