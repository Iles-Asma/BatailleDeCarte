import java.util.ArrayList;
import java.util.List;

public class Joueur {
	
	public int point ;
	public String joueur;
	
	List<Carte> deck = new ArrayList<Carte>();
	
	public Joueur(String Joueur) {
		
		this.joueur = Joueur;
		this.point = 0;
		
		
	}
	
	public String showResult() {
		
		return this.joueur + " " + this.point;
		
		
	}
	
	public Carte takeCard(int indice) {
		
		Carte carte = deck.get(indice);
		deck.remove(indice);
		return carte;
		
		
	}
	
	public void addCard(Carte card) {
		deck.add(card);
		
	}
	
	
	
	
	

	
	
}
