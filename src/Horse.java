package animal;

public class Horse implements Animal{

	private String name="馬" ;
	private int speed =80 ;

	public String getName(){
		return "馬";
	}


	public int getSpeed(){
		return 80;
	}


	public String race(Animal a){
		if(a.getSpeed() > 80){
			return "馬　lose";
		}else if(a.getSpeed() == 80){
			return "draw";
		}else{
			return "馬　win";
		}
	}	
}
