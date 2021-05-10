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
class voter_reg {
    private int voter_id;
    private String full_name , id_number, address, dob, gender;
    
    public voter_reg (int voter_id, String full_name, String id_number, String address, String dob, String gender)
    {
        this.voter_id = voter_id;
        this.full_name = full_name;
        this.id_number = id_number;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }
    public int getvoter_id(){
        return voter_id;
    }
    
    public String getfull_name(){
        return full_name;
    }
    
    public String getid_number(){
        return id_number;
    }
    
    public String getaddress(){
        return address;   
    }
    
    public String getdob(){
        return dob;
    }
    
    public String getgender(){
        return gender;
    }

   
    
}
