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
class candidate_regg {
    private String party_name , candidate_name;
    
    public candidate_regg (String party_name, String candidate_name)
    {
        this.party_name = party_name;
        this.candidate_name = candidate_name;
        
    }
    
    public String getparty_name(){
        return party_name;
    }
    
    public String getcandidate_name(){
        return candidate_name;
    }
    
}
