package ca.demo.demolistview.complex;

/**
 * Store information about a car.
 */
public class Car {
	private String make;
	private String speed;
	private int iconID;
    private String dealer;
    private String price;
    private String f_rate;
    private String l_rate;



   //private int iconID2;
	private String condition;
	
	public Car(String make, String speed, String condition, int iconID ,String dealer,String price, String f_rate, String l_rate) {
		super();
		this.make = make;
		this.speed = speed;
		this.iconID = iconID;
        this.dealer=dealer;
        this.price=price;
        this.f_rate=f_rate;
        this.l_rate=l_rate;
        //this.iconID2=iconID2;
		this.condition = condition;
	}

   public String getDealer() { return dealer;}
    public String getPrice() {
        return price;
    }
    public String getF_rate() { return f_rate;}
    public String getL_rate() { return l_rate;}
	public String getMake() {
		return make;
	}
	public String getSpeed() {return speed;}
	public int getIconID() {
		return iconID;
	}
    //public int getIconID2() {return iconID2;}
	public String getCondition() {
		return condition;
	}
}
