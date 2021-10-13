import java.util.*;

public class Main 
{

	/*CREATION DE JOUEURS*/
    public static void main(String[] args) 
    {
        Joueur joueur1 = new Joueur(null);
        Joueur joueur2 = new Joueur(null);
        jouer(joueur1, joueur2);
    }

    public static void jouer(Joueur joueur1, Joueur joueur2) 
    {
    	/*TABLEAUX*/
    	String[] type = {"trefle","coeur","pique","carreaux"};
		int[] number = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    	
        List<Carte> paquetDeCartes = new ArrayList<Carte>();
        for (int i = 0; i < 13; i++) 
        {
            for (int j = 0; j < 4; j++) 
            {
                paquetDeCartes.add(new Carte(number[i], type[j]));
            }
        }
        
        /*MELANGE LES CARTES*/
        Collections.shuffle(paquetDeCartes);

        int size = paquetDeCartes.size();
        for (int i = 0; i < size / 2; i++)
            joueur1.addCard(paquetDeCartes.get(i));
            
        for (int i = size / 2; i < size; i++)
        	joueur2.addCard(paquetDeCartes.get(i));

        while (joueur1.deck.size()>= 1 && joueur2.deck.size()>= 1){
            if (joueur1.deck.size()==1){
                System.out.println("joueur2  est le vainqueur");
                break;
            }
            if (joueur2.deck.size()==1){
                System.out.println("joueur1 est le vainqueur");
                break;
            }
            List<Carte> liste = new ArrayList<Carte>();
            Carte c1 = joueur1.deck.get(0);
            Carte c2 = joueur2.deck.get(0);
            if (c1.getNumber() < c2.getNumber()){
                joueur1.deck.remove(0);
                joueur2.deck.add(c1);
                joueur2.deck.add(c2);
                joueur2.deck.addAll(liste);
                joueur2.point += 1;
            }
            else if (c1.getNumber() > c2.getNumber()) {
            	joueur2.deck.remove(0);
                joueur1.deck.add(c2);
                joueur1.deck.add(c1);
                joueur2.deck.addAll(liste);
                joueur1.point += 1;
            }
            else {
                joueur2.deck.remove(0);
                joueur1.deck.remove(0);
                liste.add(c1);
                liste.add(c2);
            }
        }
    }
}
