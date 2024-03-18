package Program;


	public class CarRBCA22106 extends VehicleRBCA22106 {
	    private String make;

	    public CarRBCA22106 (int horsepower, String make) {
	        super(horsepower);
	        this.make = make;
	    }

	    public void drive() {
	        super.drive();
	        System.out.println("Car is being driven");
	    }

	    public String getMake() {
	        return make;
	    }
	}
	



