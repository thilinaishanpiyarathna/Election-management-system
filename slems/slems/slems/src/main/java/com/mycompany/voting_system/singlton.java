/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.mycompany.voting_system;

/**
 *
 * @author USER
 */
public class singlton {
    
    private static singlton singlton;
    private singlton()
    {
        
    }
    public static singlton getInstance()
    {
        if(null == singlton)
        {
            singlton = new singlton();
        }
        return singlton;
    }
                
}
