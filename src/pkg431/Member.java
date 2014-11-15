package pkg431;

import java.io.Serializable;

/**
 *
 * @author Garrett
 * @author Cha
 * @since 11/7/14
 */
public class Member implements Serializable {

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
    private boolean _suspendStatus;

    public Member(String Name, int ID, String Address, String City, String State, String ZipCode) {
        if(Name != null && Name.length() > NAME_LENGTH)
            Name = Name.substring(0, NAME_LENGTH);
        this._name = Name;
        
        if(Address != null && Address.length() > ADDRESS_LENGTH)
            Address = Address.substring(0, ADDRESS_LENGTH);
        this._address = Address;
        
        if(City != null && City.length() > CITY_LENGTH)
            City = City.substring(0, CITY_LENGTH);
        this._city = City;
        
        if(State != null && State.length() > STATE_LENGTH)
            State = State.substring(0, STATE_LENGTH);
        this._state = State;
        
        if(ZipCode != null && ZipCode.length() > ZIP_LENGTH)
            ZipCode = ZipCode.substring(0, ZIP_LENGTH);
        this._zipcode = ZipCode;
        
        this._ID = ID;
    }

    public void update(String Name, String Address, String City, String State, String ZipCode) {
        if(Name != null && Name.length() > NAME_LENGTH)
            Name = Name.substring(0, NAME_LENGTH);
        this._name = Name;
        
        if(Address != null && Address.length() > ADDRESS_LENGTH)
            Address = Address.substring(0, ADDRESS_LENGTH);
        this._address = Address;
        
        if(City != null && City.length() > CITY_LENGTH)
            City = City.substring(0, CITY_LENGTH);
        this._city = City;
        
        if(State != null && State.length() > STATE_LENGTH)
            State = State.substring(0, STATE_LENGTH);
        this._state = State;
        
        if(ZipCode != null && ZipCode.length() > ZIP_LENGTH)
            ZipCode = ZipCode.substring(0, ZIP_LENGTH);
        this._zipcode = ZipCode;

    }

    public String getName() {
        return _name;
    }

    public int getID() {
        return _ID;
    }

    public String getAddress() {
        return _address;
    }

    public String getCity() {
        return _city;
    }

    public String getState() {
        return _state;
    }

    public String getZipcode() {
        return _zipcode;
    }

    public boolean isSuspend() {
        return _suspendStatus;
    }

    // set suspend() and unsuspend()
    public void setSuspendStatus(boolean _suspendStatus) {
        this._suspendStatus = _suspendStatus;
    }
}
