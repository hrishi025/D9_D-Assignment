package ass5.que1;

public class Address {
    private String CityName;
    private String stateName;
    private  String pin;
    //Default Constructor
    public Address() {
        //this("",  "",  "" );
        CityName = "";
        this.stateName = "";
        this.pin = "";
    }
    //Parameterised Constructor
    public Address(String cityName, String stateName, String pin) {
        CityName = cityName;
        this.stateName = stateName;
        this.pin = pin;
    }

    //Setters
    public void setCityName(String cityName) {
        CityName = cityName;
    }
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }

    //Getters
    public String getCityName() {
        return CityName;
    }
    public String getStateName() {
        return stateName;
    }
    public String getPin() {
        return pin;
    }
}
