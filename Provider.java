/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogeti;

/**
 *
 * @author Brandon
 */
import java.util.*;
import java.io.*;

public class Provider implements Serializable{
    private static final long serialVersionUID = 1L;
    private List services = new LinkedList();
    
    
    String providerName;
    String id;
    double providerAmount;
    
    public Provider(String providerName, double providerAmount, String id){
        this.providerName = providerName;
        this.providerAmount = providerAmount;
        this.id = id;
    }
    
    public Iterator getListOfServices(){
        return services.iterator();
    }
    
    public String getProviderName(){
        return providerName;
    }
    
    public void setProviderName(String providerName){
        this.providerName = providerName;
    }
    
    public double getProviderAmt(){
        return providerAmount;
    }
    
    public void setProviderAmt(double providerAmount){
        this.providerAmount = providerAmount;
    }
    
    public String getId(){
        return id;
    } 
    
    public void addServiceRecord(){
        
    }
    
    public void update(){
        
    }
}
