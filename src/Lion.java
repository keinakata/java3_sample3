package animal;

public class Lion inplements Animal{

	public String getName(){

		return "���C�I��";
	}

	public int getSpeed(){
	
		return 60;
	}

	public String race(Animal a){
	
		if(a.getSpeed() > 60){

			return "���C�I�� lose";
			
		}else if(a.getSpeed() == 60){
			
			return "drow";
			
		}else{
		
			return "���C�I�� win";
		
		}
	}
}