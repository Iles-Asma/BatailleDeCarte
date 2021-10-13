
public class Carte {
	
	private int number;
	private String type;		
	
	public Carte(int number, int type) {
		
		this.number = number;
		this.type = type;
	
		
	}
	
	public int getNumber() {
		return number;
	
	}
	
	public String getType() {
		return type;
		
	}
	
	public void concatenation() {
		
		String Carte = "de" + type;
		
	switch (number) {
	
		case 1:
			Carte = "as" + Carte;
			break;
		
		case 2: 
			Carte = number + Carte;
			break;
		
		case 3:
			Carte = number + Carte;
			break;
		
		case 4:
			Carte = number + Carte;
			break;
		
		case 5:
			Carte = number + Carte;
			break;
		
		case 6:
			Carte = number + Carte; 
			break;
			
		case 7:
			Carte = number + Carte; 
			break;
			
		case 8:
			Carte = number + Carte; 
			break;
			
		case 9:
			Carte = number + Carte; 
			break;
			
		case 10:
			Carte = number + Carte; 
			break;
			
		case 11:
			Carte = "valet" + Carte; 
			break;
			
		case 12:
			Carte = "reine" + Carte; 
			break;
			
		case 13:
			Carte = "roi" + Carte; 
			break;
			
		default :
			System.out.println("ta carte n'existe pas");
	
	
	}
		
		
		
	}
	

	

}
