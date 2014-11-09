/**
 *
 * @author Nabin
 * @since 11/7/14
 */
public class Service {
    private String _name;
    private int _ID;
    private double _fee;;
    
    public Service(String Name, int ID, double Fee)
    {
        this._name = Name;
		this._ID = ID;
		this._fee = Fee;
	}
	public String getServiceName(){
	return Name;
	}
	
	public String setServiceName(){String serviceName)
	this._name = serviceName;
	}
	
	public int getServiceCost(){
	return Fee;
	}
	
	public int setServiceCost(){ int fee
	this._fee = Fee;
	}
	
	public void update(String _name, int _ID, double _fee){
	this._name = _name;
	this._ID = _ID;
	this._fee = _fee;
	}
}
