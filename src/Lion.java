package animal;

public class Lion inplements Animal{

	public String getName(){

		return "ライオン";
	}

	public int getSpeed(){
	
		return 60;
	}

	public String race(Animal a){
	
		if(a.getSpeed() > 60){

			return "ライオン lose";
			
		}else if(a.getSpeed() == 60){
			
			return "drow";
			
		}else{
		
			return "ライオン win";
		
		}
	}
}