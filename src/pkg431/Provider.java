package pkg431;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon
 */
import java.util.*;
import java.io.*;

public class Provider implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private final int NAME_LENGTH = 25;
    private final int ADDRESS_LENGTH = 25;
    private final int CITY_LENGTH = 14;
    private final int STATE_LENGTH = 2;
    private final int ZIP_LENGTH = 5;
    private final int BANK_LENGTH = 25;
    private final int ACC_NUM_LENGTH = 5;
    
  
    private String _name;
    private int _ID;
    private String _address;
    private String _city;
    private String _state;
    private String _zipcode;
    
    // bank stuff
    private String bankName;
    private String accountNum;
    private double providerAmount;
    
    public Provider(String name, int ID, String address, String city, String state, String zipCode, String bankName, String accountNum)
    {
        if(name != null && name.length() > NAME_LENGTH)
            name = name.substring(0, NAME_LENGTH);
        this._name = name;
        
        this._ID = ID;
        
        if(address != null && address.length() > ADDRESS_LENGTH)
            address = address.substring(0, ADDRESS_LENGTH);
        this._address = address;
        
        if(city != null && city.length() > CITY_LENGTH)
            city = city.substring(0, CITY_LENGTH);
        this._city = city;
        
        if(state != null && state.length() > STATE_LENGTH)
            state = state.substring(0, STATE_LENGTH);
        this._state = state;
        
        if(zipCode != null && zipCode.length() > ZIP_LENGTH)
            zipCode = zipCode.substring(0, ZIP_LENGTH);
        this._zipcode = zipCode;
        
        
        //Factory should also account for account name
        //And account number of provider
        
        if(bankName != null && bankName.length() > BANK_LENGTH)
            bankName = bankName.substring(0, BANK_LENGTH);
        this.bankName = bankName;
        
        if(accountNum != null && accountNum.length() > ACC_NUM_LENGTH)
            accountNum = accountNum.substring(0, ACC_NUM_LENGTH);
        this.accountNum = accountNum;
    }
    
    //Returns the provider name
    public String getProviderName(){
        return _name;
    }
    
    //Returns the ID of the provider
    public int getId(){
        return this._ID;
    } 
    
    //returns the amount owed to the provider
    public double getProviderAmt(){
        return providerAmount;
    }
    
    //Adds (or subtracts if amtOwed is negative) to the total amount owed to the provider
    public void setProviderAmt(double amtOwed){
        this.providerAmount += amtOwed;
    }
    
    /**
    * @param address the address to set
    */
    public String getAddress() {
        return this._address;
    }
    
    /**
     * @return the _city
     */
    public String getCity() {
        return _city;
    }

    /**
     * @return the _state
     */
    public String getState() {
        return _state;
    }

    /**
     * @return the _zipcode
     */
    public String getZipcode() {
        return _zipcode;
    }
       
    //Updates the provider bank account. 
    public void updateBankAccount(String bankName, String accountNum){
        if(bankName != null && bankName.length() > BANK_LENGTH)
            bankName = bankName.substring(0, BANK_LENGTH);
        this.bankName = bankName;
        
        if(accountNum != null && accountNum.length() > ACC_NUM_LENGTH)
            accountNum = accountNum.substring(0, ACC_NUM_LENGTH);
        this.accountNum = accountNum;
    }
    
    public String getBankAccountName(){
        return bankName;
    }
    
    public String getBankAccountNum(){
        return accountNum;
    }

    public void update(String name, String address, String city, String state, String zipCode){
        if(name != null && name.length() > NAME_LENGTH)
            name = name.substring(0, NAME_LENGTH);
        this._name = name;
        
        if(address != null && address.length() > ADDRESS_LENGTH)
            address = address.substring(0, ADDRESS_LENGTH);
        this._address = address;
        
        if(city != null && city.length() > CITY_LENGTH)
            city = city.substring(0, CITY_LENGTH);
        this._city = city;
        
        if(state != null && state.length() > STATE_LENGTH)
            state = state.substring(0, STATE_LENGTH);
        this._state = state;
        
        if(zipCode != null && zipCode.length() > ZIP_LENGTH)
            zipCode = zipCode.substring(0, ZIP_LENGTH);
        this._zipcode = zipCode;       
    }
    
}
