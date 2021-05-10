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
class officer_reg {
    private int officer_id;
    private String full_name , id_number, address, dob, gender, password;
    
    public officer_reg (int officer_id, String full_name, String id_number, String address, String dob, String gender, String password)
    {
        this.officer_id = officer_id;
        this.full_name = full_name;
        this.id_number = id_number;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
        this.password = password;
    }
    public int getofficer_id(){
        return officer_id;
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
    public String getpassword(){
        return password;
    }
}
