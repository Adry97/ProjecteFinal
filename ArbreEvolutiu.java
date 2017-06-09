/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.ArrayList;

/**
 *
 * @author Skylake-Adry
 */
public class ArbreEvolutiu {
    BinaryTree arbre;
    Genoma a;
  
    
    
    @SuppressWarnings("empty-statement")
    public ArbreEvolutiu(int mat[][],ArrayList<Genoma> a){
        int b=2;
        Genoma ex = new Genoma("hola","adeu");
    
       /*BinaryTree arbresq=new BinaryTree(ex);
       BinaryTree arbredret=new BinaryTree(ex);
       BinaryTree arbre=new BinaryTree(ex,arbresq,arbredret);
       arbre.value(ex);
       */

        int nivells=0;
        /*while(nivells<5){
            arbre.setRightChild(arbredret);
            arbre.setLeftChild(arbresq);
        }*/
       // System.out.println(arbre);
       int k=0;
       int var2=2000;
       int aux=10000;
       ArrayList nums = new ArrayList(13);
       int[] num= new int[13];
       for(int i=0;i<a.size();i++){
            for(int j=0;j<a.size();j++){
                if(mat[i][j]!=0){
                    int m=mat[i][j];
                    aux=Math.min(aux,m);
                    //System.out.println("buccca");
                    if(j==12){
                        System.out.println("hola");
                        if(num[0]!=0){
                            for(int z=0;z<a.size();++z){
                                  int var=num[z];
                              var2= Math.min(var, var2);
                             }
                            //System.out.print(num[0]);
                        }
                        num[k]=var2;
                        System.out.println(num[k]);
                        ++k;
                    }  
                }
                else ++j;

            }       
        }
       System.out.println("aquii");
       for (int x=0;x<nums.size();++x){
           System.out.print(num[x]);
           
       }
                    
                
            
            
    
    }

            
}

    
    
    

