/**
 *
 * @author Garrett
 * @author Cha
 * @since 11/7/14
 */
public class Member {

    private String _name;
    private int _ID;
    private String _address;
    private String _city;
    private String _state;
    private String _zipcode;
    private boolean _suspendStatus;

    public Member(String Name, int ID, String Address, String City, String State, String ZipCode) {
        this._name = Name;
        this._address = Address;
        this._city = City;
        this._state = State;
        this._zipcode = ZipCode;
        this._ID = ID;
    }

    public void update(String Name, String Address, String City, String State, String ZipCode) {
        this._name = Name;
        this._address = Address;
        this._city = City;
        this._state = State;
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
