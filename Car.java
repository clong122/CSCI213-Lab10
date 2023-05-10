/**
 * This program extends Vehicle to create the Car object 
 * @author Casey Long
 *
 */
public class Car extends Vehicle{

	private int numDoors;
	private int numPass;
	
	
	public Car(String aMake, String aModel, String aPlate, int doors, int pass) {
		super(aMake, aModel, aPlate);
		this.numDoors = doors;
		this.numPass = pass;
		
	}
	
	public int getDoors(){
		return this.numDoors;
		
	}
	
	public int getPass(){
		return this.numPass;
		
	}
	
	public boolean equals(Object obj){
			if(!(obj instanceof Car)) {
				return false;
		}
		
		Car other = (Car) obj;
		
		if(super.equals(other) == true && this.numDoors == other.getDoors() && this.numPass == other.getPass()){
			return true;
		}
		else{
			return false;	
			
		}
	}
	
	public String toString(){
		String tempMake = super.getMake();
		String tempModel = super.getModel();
		String tempPlate = super.getPlate();
		int tempDoors = this.numDoors;
		int tempPass = this.numPass;
		
		String result = String.format("%d-door %s %s with liscence %s", tempDoors, tempMake, tempModel, tempPlate);
		return result;
	}
	
	public Car copy(){
		String tempMake = super.getMake();
		String tempModel = super.getModel();
		String tempPlate = super.getPlate();
		int tempDoors = this.numDoors;
		int tempPass = this.numPass;
		
		Car copyCar = new Car(tempMake,tempModel,tempPlate,tempDoors,tempPass);
		return copyCar;
		
		
	}
	
	}