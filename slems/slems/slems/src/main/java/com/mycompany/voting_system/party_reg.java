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
class party_reg {
    private int party_id;
    private String party_name , party_mem_amount, contact_no ;
    private byte[] picture;
    
    public party_reg (int party_id, String party_name, String party_mem_amount, String contact_no, byte[]image)
    {
        this.party_id = party_id;
        this.party_name = party_name;
        this.party_mem_amount = party_mem_amount;
        this.contact_no = contact_no;
        this.picture = image;

    }
    public int getparty_id(){
        return party_id;
    }
    
    public String getparty_name(){
        return party_name;
    }
    
    
    public String getparty_mem_amount(){
        return party_mem_amount;   
    }
    
    public String getcontact_no(){
        return contact_no;
    }
    public byte[] getImage(){
        return picture;
    }
    
}
