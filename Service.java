/**
 *
 * @author Nabin
 * @since 11/7/14
 */
public class Service {

    private String _name;
    private int _ID;
    private double _fee;

    ;
    
    public Service(String Name, int ID, double Fee) {
        this._name = Name;
        this._ID = ID;
        this._fee = Fee;
    }

    public String getServiceName() {
        return _name;
    }

    public void setServiceName(String serviceName) {
        this._name = serviceName;
    }

    public double getServiceCost() {
        return _fee;
    }

    public void setServiceCost(double Fee) {
        this._fee = Fee;
    }

    public void update(String _name, double _fee) {
        this._name = _name;
        this._fee = _fee;
    }

    /**
     * @return the _ID
     */
    public int getID() {
        return _ID;
    }

    /**
     * @param _ID the _ID to set
     */
    public void setID(int _ID) {
        this._ID = _ID;
    }
}
