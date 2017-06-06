/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 *
 * @author Skylake-Adry
 */
public class ArbreEvolutiu {
    BinaryTree arbre;
    Genoma a;
  
    
    
    public ArbreEvolutiu(int mat[][],ArrayList<Genoma> a){
        int b=2;
        Genoma ex = new Genoma("hola","adeu");
    
       BinaryTree arbresq=new BinaryTree(ex);
       BinaryTree arbredret=new BinaryTree(ex);
       BinaryTree arbre=new BinaryTree(ex,arbresq,arbredret);
       arbre.value(ex);
        
        int i=0;
        int j=0;
        int nivells=0;
        while(nivells<5){
            arbre.setRightChild(arbredret);
            arbre.setLeftChild(arbresq);
        }
        System.out.println(arbre);
       /* for(i=0;i<13;i++){
            for(j=0;j<13;j++)
                arbre.value(mat[i][j]);
                arbre.setRightChild(arbredret);
                arbre.setLeftChild(arbresq);
                
         */   
            
    
    }

            
        }

    
    
    

