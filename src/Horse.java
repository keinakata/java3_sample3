package animal;

public class Horse implements Animal{

	private String name="�n" ;
	private int speed =80 ;

	public String getName(){
		return "�n";
	}


	public int getSpeed(){
		return 80;
	}


	public String race(Animal a){
		if(a.getSpeed() > 80){
			return "�n�@lose";
		}else if(a.getSpeed() == 80){
			return "draw";
		}else{
			return "�n�@win";
		}
	}	
}
