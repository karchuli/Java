/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ACO;

/**
 *
 * @author EGC07
 */

public class ds {

  public static void main(String args[]) 
  {
    long startTime = System.nanoTime();
    ds ext = new ds();
    ext.callMethod();
    long endTime = System.currentTimeMillis();
    System.out.println("Total elapsed time in execution of"
        + " method callMethod() is :" + (startTime));
  }

  public void callMethod() {
    System.out.println("Calling method");
    for (int i = 1; i <= 10; i++) {
      System.out.println("Value of counter is " + i);
    }
  }
}

