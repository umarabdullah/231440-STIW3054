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
public class MyTest extends Thread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new Thread(new MyTest()).start();
       
    }
      public void run() {
        try {
            String j="";
            for (int x = 0; x < 10; x++) {
                if(((x%10)==0)&&(x!=0)){
                j=x+"A";
                System.out.println(j);
                }
                else{
                System.out.println(x);}
                sleep(2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
