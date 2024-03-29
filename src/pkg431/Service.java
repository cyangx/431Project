package pkg431;

import java.io.Serializable;

/**
 * Entity Class representing a service provided by Pizza Anonymous
 * @author Garrett
 * @author Nabin
 * @since 11/7/14
 */
public class Service implements Serializable {

    private static final long serialVersionUID = 1L;

    private final int NAME_LENGTH = 20;
    private final double MAX_FEE = 999.99;

    private String _name;
    private int _ID;
    private double _fee;

    public Service(String Name, int ID, double Fee) {
        if (Name != null && Name.length() > NAME_LENGTH) {
            Name = Name.substring(0, NAME_LENGTH);
        }
        this._name = Name;

        this._ID = ID;

        if (Fee > MAX_FEE) {
            Fee = MAX_FEE;
        }
        this._fee = Fee;
    }

    public String getServiceName() {
        return _name;
    }

    public double getServiceCost() {
        return _fee;
    }

    /**
     * @return the _ID
     */
    public int getID() {
        return _ID;
    }

    public void update(String _name, double _fee) {
        if (_name != null && _name.length() > NAME_LENGTH) {
            _name = _name.substring(0, NAME_LENGTH);
        }
        this._name = _name;
        
        if (_fee > MAX_FEE) {
            _fee = MAX_FEE;
        }
        this._fee = _fee;
    }

}
