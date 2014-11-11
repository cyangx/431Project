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
        if(name != null && name.length() > NAME_LENGTH)
            name = name.substring(0, NAME_LENGTH - 1);
        this._name = name;
        
        this._ID = ID;
        
        if(address != null && address.length() > ADDRESS_LENGTH)
            address = address.substring(0, ADDRESS_LENGTH - 1);
        this._address = address;
        
        if(city != null && city.length() > CITY_LENGTH)
            city = city.substring(0, CITY_LENGTH - 1);
        this._city = city;
        
        if(state != null && state.length() > STATE_LENGTH)
            state = state.substring(0, STATE_LENGTH - 1);
        this._state = state;
        
        if(zipCode != null && zipCode.length() > ZIP_LENGTH)
            zipCode = zipCode.substring(0, ZIP_LENGTH - 1);
        this._zipcode = zipCode;
        //Factory should also account for account name
        //And account number of provider
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
       
    //Updates the provider bank account. 
    public void updateBankAccount(String bankName, int accountNum){
        this.bankName = bankName;
        this.accountNum = accountNum;
    }

    public void update(String name, String address, String city, String state, String zipCode){
        if(name != null && name.length() > NAME_LENGTH)
            name = name.substring(0, NAME_LENGTH - 1);
        this._name = name;
        
        if(address != null && address.length() > ADDRESS_LENGTH)
            address = address.substring(0, ADDRESS_LENGTH - 1);
        this._address = address;
        
        if(city != null && city.length() > CITY_LENGTH)
            city = city.substring(0, CITY_LENGTH - 1);
        this._city = city;
        
        if(state != null && state.length() > STATE_LENGTH)
            state = state.substring(0, STATE_LENGTH - 1);
        this._state = state;
        
        if(zipCode != null && zipCode.length() > ZIP_LENGTH)
            zipCode = zipCode.substring(0, ZIP_LENGTH - 1);
        this._zipcode = zipCode;       
    }
}