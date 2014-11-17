package pkg431;

/**
 * @author Brandon Theisen
 */
/*
Provider.java
Description: Manages the functionality of provider.
             Information here is either set or retrieved initially
             from the ProviderList.
             When a provider is instantiated, the information stored is the ID,
             provider name, address, city, state, zip, bank name and account
             number. All are saved as strings, except for the ID.
*/
import java.util.*;
import java.io.*;

public class Provider implements Serializable{
    private static final long serialVersionUID = 1L;
    
    //Max string lengths
    private final int NAME_LENGTH = 25;
    private final int ADDRESS_LENGTH = 25;
    private final int CITY_LENGTH = 14;
    private final int STATE_LENGTH = 2;
    private final int ZIP_LENGTH = 5;
    private final int BANK_LENGTH = 25;
    private final int ACC_NUM_LENGTH = 5;
    
    //Information of provider
    private String _name;
    private int _ID;
    private String _address;
    private String _city;
    private String _state;
    private String _zipcode;
    
    //Bank account information for provider
    private String bankName;
    private String accountNum;
    
    
    //Constructor of the provider
    //Stores the initial information within a certain string length
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
    
    //Returns the address of the provider
    public String getAddress() {
        return this._address;
    }
    
    //Returns the city of the provider
    public String getCity() {
        return _city;
    }
    
    //Returns the state of the provider
    public String getState() {
        return _state;
    }

    //Returns the zipcode of the provider
    public String getZipcode() {
        return _zipcode;
    }
       
    //Updates the provider bank account. 
    //Information updated is the bank name and account number
    public void updateBankAccount(String bankName, String accountNum){
        if(bankName != null && bankName.length() > BANK_LENGTH)
            bankName = bankName.substring(0, BANK_LENGTH);
        this.bankName = bankName;
        
        if(accountNum != null && accountNum.length() > ACC_NUM_LENGTH)
            accountNum = accountNum.substring(0, ACC_NUM_LENGTH);
        this.accountNum = accountNum;
    }
    
    //Returns the provider's bank name
    public String getBankAccountName(){
        return bankName;
    }
    
    //Returns the provider's account number
    public String getBankAccountNum(){
        return accountNum;
    }

    //Updates the provider's name, address, city, state and zipcode within
    //a certain maximum string length
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
