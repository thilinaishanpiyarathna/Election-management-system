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
class candidate_reg {
    private int candidate_id, contact_no;
    private String party_name , candidate_name, id_number, dob, gender;
    
    public candidate_reg (int candidate_id, String party_name, String candidate_name, String id_number,  String dob, String gender, int contact_no)
    {
        this.candidate_id = candidate_id;
        this.party_name = party_name;
        this.candidate_name = candidate_name;
        this.id_number = id_number;
        this.dob = dob;
        this.gender = gender;
        this.contact_no = contact_no;
    }
    public int getcandidate_id(){
        return candidate_id;
    }
    
    public String getparty_name(){
        return party_name;
    }
    
    public String getcandidate_name(){
        return candidate_name;
    }
    public String getid_number(){
        return id_number;
    }
    
    public String getdob(){
        return dob;
    }
    
    public String getgender(){
        return gender;
    }
    public int getcontact_no(){
        return contact_no;
    }
}
