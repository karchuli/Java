/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ACO;

import java.util.ArrayList;


public class antpool 
{
    public static ArrayList k=Vms.vmload;
    private int vm;
    public static ArrayList ant=new ArrayList();
    
    public antpool()
            {
                getantpool(vm);
            }

    private void getantpool(int vm) {
       for(int d=0;d<k.size();d++)
       {
          ant.add(k.get(d).toString());
       }
        
    }
}
