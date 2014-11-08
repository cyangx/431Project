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
    
    
  
    private String _name;
    private int _ID;
    private String _address;
    private String _city;
    private String _state;
    private String _zipcode;
    private String bankName;
    private int accountNum;
    private double providerAmount;
    
    public Provider(String name, int ID, String address, String city, String state, String zipCode)
    {
        this._name = name;
        this._ID = ID;
        this._address = address;
        this._city = city;
        this._state = state;
        this._zipcode = zipCode;
        //Factory should also account for account name
        //And account number of provider
    }
    
    //Returns the list of services
    public Iterator getListOfServices(){
        return services.iterator();
    }
    
    //Returns the provider name
    public String getProviderName(){
        return _name;
    }
    
    //Changes the provider name
    public void setProviderName(String providerName){
        this._name = providerName;
    }
    
    //returns the amount owed to the provider
    public double getProviderAmt(){
        return providerAmount;
    }
    
    //Adds the amount owed to the provider
    public void setProviderAmt(double providerAmount){
        this.providerAmount += providerAmount;
    }
    
    //Returns the ID of the provider
    public int getId(){
        return this._ID;
    } 
    
    //Don't know what this does yet or how to implement
    public void addServiceRecord(){
        
    }
    
    //Updates the provider bank account. 
    public void update(String bankName, int accountNum){
        this.bankName = bankName;
        this.accountNum = accountNum;
    }
}